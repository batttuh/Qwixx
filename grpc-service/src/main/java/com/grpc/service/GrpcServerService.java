package com.grpc.service;



import com.grpc.Empty;
import com.grpc.QwixxServiceGrpc;
import com.grpc.Response;
import com.grpc.Room;
import com.grpc.Time;
import com.grpc.User;
import com.grpc.UserList;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@GrpcService
public class GrpcServerService extends QwixxServiceGrpc.QwixxServiceImplBase {
     static Map<Room,ArrayList<User>> user=new HashMap<>();
     static Map<Room,Integer> queue=new HashMap<>();
     static Map<Room,Time> timer=new HashMap<>();
    static Map<Room,Boolean> games=new HashMap<>();
     static List<StreamObserver<UserList>> observers=new ArrayList<>();
    static List<StreamObserver<User>> currentUserObserver=new ArrayList<>();
    static List<StreamObserver<Response>> startGameObserver=new ArrayList<>();


    public void updateDice(com.grpc.User request,
                           io.grpc.stub.StreamObserver<com.grpc.Empty> responseObserver) {
        user.get(request.getRoom()).set(queue.get(request.getRoom()), request);
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    public void getStartedGame(com.grpc.Room request,
                               io.grpc.stub.StreamObserver<com.grpc.Response> responseObserver) {
        startGameObserver.add(responseObserver);

        for(StreamObserver<Response> observer:startGameObserver){
            if(games.get(request)){
                observer.onNext(Response.newBuilder().setMsg("started").setError(0).build());
            }else{
                observer.onNext(Response.newBuilder().setMsg("not Started").setError(1).build());

            }

        }
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
        startGameObserver.remove(responseObserver);

       // responseObserver.onCompleted();
      //  observers.remove(responseObserver);

    }

    public void getAllUsers(Room request, StreamObserver<UserList> responseObserver) {

        observers.add(responseObserver);
        UserList list=UserList.newBuilder().addAllUsers(user.get(request)).build();

        for(StreamObserver<UserList> observer:observers){
            observer.onNext(list);
        }

     //   responseObserver.onCompleted();
   //   observers.remove(responseObserver);
    }

    public void startGame(com.grpc.Room request,
                          io.grpc.stub.StreamObserver<com.grpc.Empty> responseObserver) {
        games.replace(request,true);
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();

    }

    public void currentUser(Room request, StreamObserver<User> responseObserver) {

        currentUserObserver.add(responseObserver);

            for(StreamObserver<User> observer:currentUserObserver){
                int userQueue=queue.get(request);
                observer.onNext(user.get(request).get(userQueue));

            }
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            responseObserver.onCompleted();
            currentUserObserver.remove(responseObserver);

    }


    public void removeRoom(com.grpc.Room request,
                           io.grpc.stub.StreamObserver<com.grpc.Empty> responseObserver) {
        user.remove(request);
        responseObserver.onCompleted();
    }

    public void nextUser(com.grpc.Room request,
                         io.grpc.stub.StreamObserver<com.grpc.User> responseObserver) {
        int list=(queue.get(request)+1)%user.get(request).size();
        queue.replace(request,list);
        int userQueue=queue.get(request);
        responseObserver.onNext(user.get(request).get(userQueue));
        responseObserver.onCompleted();
    }

    public void join(User request, StreamObserver<User> responseObserver) {
        Room room=Room.newBuilder().setRoomId(request.getRoom().getRoomId()).build();
        List<Room> findRoom=user.keySet().stream().filter(room1 -> room1.getRoomId().equals(room.getRoomId())).collect(Collectors.toList());
        if(user.keySet().stream().anyMatch(room1 -> request.getRoom().getRoomId().equals(room1.getRoomId()))){
            user.get(findRoom.get(0))
                    .add(request.toBuilder()
                            .setRoom(findRoom.get(0))
                            .setQueue(user.get(findRoom.get(0)).size())
                            .setId(UUID.randomUUID().toString()).build());
            responseObserver.onNext(user.get(findRoom.get(0)).get(user.get(findRoom.get(0)).size()-1));
        }else{

            responseObserver.onError(new Throwable());
        }
        responseObserver.onCompleted();
    }

    public void setTime(Time request, StreamObserver<Empty> responseObserver) {
        if(timer.containsKey(request.getRoom())){
            timer.replace(request.getRoom(),request);
        }else{
            timer.put(request.getRoom(),request);

        }
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    public void startTimer(Room request, StreamObserver<Time> responseObserver) {
        LocalDateTime deadline= LocalDateTime.now().plusSeconds(timer.get(request).getTime());
        int timeCount=timer.get(request).getTime();
        Room room=request;
        while (LocalDateTime.now().isBefore(deadline)) {
            responseObserver.onNext(Time.newBuilder().setTime(timeCount).setRoom(room).build());
            try {
                Thread.sleep(1000);
                timeCount--;
                timer.replace(request,Time.newBuilder().setTime(timeCount).setRoom(request).build());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onNext(Time.newBuilder().setTime(timeCount).setRoom(room).build());
        responseObserver.onCompleted();
    }

    public void create(User request, StreamObserver<User> responseObserver) {
        Room room=Room.newBuilder().setRoomId(request.getRoom().getRoomId()).setSixSide(request.getRoom().getSixSide()).build();
        if(user.containsKey(room)){
            responseObserver.onError(new Throwable("Room already exist"));

        }else{
            games.put(room,false);
            user.put(room,new ArrayList<>());
            String uuid=UUID.randomUUID().toString();
            while(user.containsKey(uuid)){
                uuid=UUID.randomUUID().toString();
            }
            user.get(room).add(request.toBuilder().setQueue(user.get(room).size()).setId(uuid).build());
            responseObserver.onNext(user.get(request.getRoom()).get(user.get(room).size()-1));
            queue.put(request.getRoom(),0);
        }
        responseObserver.onCompleted();
    }



    public void receiveDice(com.grpc.Room request,
                            io.grpc.stub.StreamObserver<com.grpc.User> responseObserver) {
        user.get(request).forEach(responseObserver::onNext);
        responseObserver.onCompleted();
    }

}
