
import 'dart:async';

import 'package:flutter/material.dart';
import 'package:lottie/lottie.dart';
import 'package:qwixx_project/controller/client_server_controller.dart';
import 'package:qwixx_project/view/online_game_view.dart';
import 'package:shared_preferences/shared_preferences.dart';

import '../src/generated/proto/src/main/proto/schema.pbgrpc.dart';

class WaitingUser extends StatefulWidget {
  final bool side;
  final User user;
  const WaitingUser({Key? key,required this.side, required this.user}) : super(key: key);

  @override
  State<WaitingUser> createState() => _WaitingUserState();
}

class _WaitingUserState extends State<WaitingUser> {
  late final ClientController clientController;
  @override
  void initState() {
    super.initState();
        connectClient();
        storeUserId();
      
 
  }
  

  Future<void> storeUserId() async {
    SharedPreferences preferences = await SharedPreferences.getInstance();
    preferences.setString("userId", widget.user.id);
  }
  Future<void> connectClient() async {
    
      clientController=ClientController();
  } 
    Stream<UserList> getAllUsers() async* {
          var response = clientController.getAllUsers(Room(roomId: widget.user.room.roomId,sixSide: widget.side));
          await for (var msg in response) {
          yield msg;
    }
  }
  Stream<Response> startGameListen()async*{
  
    var response = clientController.getStartedGame(Room(roomId: widget.user.room.roomId,sixSide: widget.side));
    await for (var msg in response) {
      if(msg.msg=="started"){
        Navigator.pushReplacement(context, MaterialPageRoute(builder: (context)=>OnlineGameView(side: widget.side,user: widget.user)));
      }
      
    }
  }



  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Waiting for User"),
        centerTitle: true,
        leading:  IconButton(onPressed: (){
        },icon: const Icon(Icons.abc_outlined)),
      ),
      body:  Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            
               StreamBuilder<UserList>(stream: getAllUsers(),
              builder: (context, snapshot) {
                if(snapshot.connectionState==ConnectionState.waiting){
                  return const CircularProgressIndicator();
                }
                else{
                  if(snapshot.hasData){
                    return Column(
                      children: [
                        SizedBox(height: MediaQuery.of(context).size.height*0.2,child: Lottie.asset("assets/animation/pigeon.json")),
                        Text("Waiting for User\n",style: Theme.of(context).textTheme.headline3,textAlign: TextAlign.center,),
                        Text("${widget.user.room.roomId}\n\n Other users can join with this id\n\n${snapshot.data!.users.length} User Here",
                      style: Theme.of(context).textTheme.headline6,textAlign: TextAlign.center,),
                      ]
            
                    );
                    
                  }
                  else{
                    return const Text("0");
                  }
                  
                                }
              },
               ),
            
            
            Padding(
              padding:const EdgeInsets.only(top: 50),
              child: StreamBuilder<Response>(builder: (context, snapshot) {

                return ElevatedButton(onPressed: () async {
           
                
                  await clientController.startGame(widget.user.room).then((value) {
                    setState(() {
                      
                    });
                  
                  });  
                       
                           
                }, child: const Text("Start the game"));
              },stream: startGameListen()),
            )
              
              ],
            )
        )
      );
    
  }
}