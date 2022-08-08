

import 'package:flutter/material.dart';
import 'package:qwixx_project/src/generated/proto/src/main/proto/schema.pb.dart';
import 'package:shake/shake.dart';

import '../controller/client_server_controller.dart';
import '../controller/online_game_controller.dart';
import 'home_view.dart';

class OnlineGameView extends StatefulWidget {
  const OnlineGameView({Key? key, required this.side, required this.user}) : super(key: key);
   final bool side;
   final User user;
  @override
  State<OnlineGameView> createState() => _OnlineGameViewState();
}

class _OnlineGameViewState extends State<OnlineGameView> {
  late final ClientController controller;
  bool isThisCurrentUser=false;
  late User currentUser=widget.user;
  late OnlineGameController onlineGameController;
  late ShakeDetector detector;
   int count=0;
   bool finished=false;
   bool timeSetted=false;
   bool startTimer=false;
  @override
  void initState() {
    // TODO: implement initState
    super.initState();
   controller=ClientController();
   onlineGameController=OnlineGameController();
       shake();



  }
    void shake(){
     detector = ShakeDetector.autoStart(
    onPhoneShake: () {
       onlineGameController.rollDice(widget.side,currentUser);
          setState(() {
            
        });           
    },
    );
    }
    Stream<Time> listenTime()async*{
    var response =controller.startTimer(widget.user.room);
    await for(Time v in response) {
      if(v.time==0){
        finished=true;
        setState(() {
          
        });
      }
      yield v;
    }
    }
  Stream<User> listenCurrentUser() async*{
    var response =controller.currenUser(widget.user.room);
    await for(User v in response) {
      if(v.id!=currentUser.id){
        setState(() {
          currentUser=v;
        });
        
      }
      yield v;
    }
  }
  
  @override
  void dispose() {
    detector.stopListening();
    super.dispose();
    if(currentUser.queue==0){
      onlineGameController.removeRoom(currentUser.room);
      controller.shutDownChannel();
    }

  }
  void refreshPage(){
    setState(() {
      finished=false;
      count=0;
      startTimer=false;
      onlineGameController.enableAllDice(widget.user);
      onlineGameController.setTime(Time(room: widget.user.room,time: 30));
      timeSetted=false;
    });
  }
  

  void nextUser()async{
   await controller.nextUser(widget.user.room);
  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: startTimer?StreamBuilder<Time>(builder: (context, snapshot) {
          if(snapshot.hasData){
           
            return Text("${snapshot.data!.time} Seconds left");
            
          }else{
            return const Text("Online Game");
          }
        
        },stream: listenTime()):const Text("Online Game"),
        leading: IconButton(
          icon: const Icon(Icons.arrow_back),
          onPressed: () {
            
            Navigator.push(context,
                MaterialPageRoute(builder: (context) => const HomeView()));
          },
        ),      
        actions: [
          IconButton(
            icon: const Icon(Icons.refresh),
            onPressed: () {
              refreshPage();
            },
          ),
          IconButton(
            icon: const Icon(Icons.timer),
            onPressed: () {
              dialogMessages(context,onlineGameController);
            },
          )
        ],

      ),
      body:  SafeArea(
        child: StreamBuilder<User>(builder: (context,snapshot){
          if(snapshot.hasData){
              return SafeArea(
                child: SizedBox(
                  height: MediaQuery.of(context).size.height,
                  child: Container(
                    color: finished?Colors.red:null,
                    child: Column(children: [
                              Flexible(
                                flex: 2,
                                child: Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children:   [
                      Flexible(
                          fit: FlexFit.tight,
                          child:Padding(padding:const EdgeInsets.all(10),child: Image.asset("${snapshot.data!.dices[0].path}white${snapshot.data!.dices.first.number}.png"),),
                          
                              ),
                      Flexible(
                          fit: FlexFit.tight,
                          child:Padding(padding:const EdgeInsets.all(10),child: Image.asset("${snapshot.data!.dices[1].path}white${snapshot.data!.dices[1].number}.png"),),
                          
                      ),
                    ],
                                ),
                              ),
                              Flexible(
                                flex: 2,
                                child: Row(children: [
                    snapshot.data!.dices[2].enable
                        ? Flexible(
                          fit:FlexFit.tight,
                          child: InkWell(
                              onTap: (() 
                                {onlineGameController.disableDice(Dice_Type.blue, snapshot.data!);
                                  setState(() {
                                    
                                  });
                                }),
                              child:Padding(padding:const EdgeInsets.all(10),child: Image.asset("${snapshot.data!.dices[2].path}blue${snapshot.data!.dices[2].number}.png"),)
                        ))
                        : Container(),
                    snapshot.data!.dices[3].enable
                        ? Flexible(
                            fit: FlexFit.tight,
                            child: InkWell(
                                onTap: (() 
                                {onlineGameController.disableDice(Dice_Type.green, snapshot.data!);
                                  setState(() {
                                    
                                  });
                                }),
                                child:Padding(padding:const EdgeInsets.all(10),child: Image.asset("${snapshot.data!.dices[3].path}green${snapshot.data!.dices[3].number}.png"),)
                        ))
                        : Container(),
                                ]),
                              ),
                              Flexible(
                                flex: 2,
                                child: Row(children: [
                       snapshot.data!.dices[4].enable
                        ? Flexible(
                            fit: FlexFit.tight,
                            child: InkWell(
                                onTap: (() 
                                {onlineGameController.disableDice(Dice_Type.red, snapshot.data!);
                                  setState(() {
                                    
                                  });
                                }),
                                child: Padding(padding:const EdgeInsets.all(10),child: Image.asset("${snapshot.data!.dices[4].path}red${snapshot.data!.dices[4].number}.png"),)
                        ))
                        : Container(),
                              snapshot.data!.dices[5].enable
                            
                        ? Flexible(
                            fit: FlexFit.tight,
                            child: InkWell(
                                onTap: (() 
                                {onlineGameController.disableDice(Dice_Type.yellow, snapshot.data!);
                                  setState(() {
                                    
                                  });
                                }),
                                child: Padding(padding:const EdgeInsets.all(10),child: Image.asset("${snapshot.data!.dices[5].path}yellow${snapshot.data!.dices[5].number}.png"),)
                        ))
                        : Container(),
                                ]),
                              ),
                              Flexible(
                                flex: 1,
                                child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                    children: [Flexible(
                      flex: 1,
                      child: snapshot.data!.id==widget.user.id?ElevatedButton(
                        onPressed: () async {
                       await onlineGameController.rollDice(widget.side,snapshot.data!);
                        if(timeSetted==true){
                                startTimer=true;
                                 await  onlineGameController.setTime(Time(time: count,room: widget.user.room));
                                finished=false;

                        }
                          setState(() {
                            
                        });                        
                        },
                        style: Theme.of(context).elevatedButtonTheme.style,
                        child: const Text("Roll")):Container(),
                      
                    ),
                    Flexible(
                              
                      flex: 1,
                      child: snapshot.data!.id==widget.user.id?ElevatedButton(onPressed: ()async{
                          await  onlineGameController.setTime(Time(time: count,room: widget.user.room));

                          setState(() {
                             currentUser=snapshot.data!;
                            startTimer=false;
                          });
                          nextUser();
                        },child: const Text("Next User"),):Container(),
                    ),
                    ]
                                ),
                              ),
                            ]),
                  ),
                ),
              );
        
          }
          return const Text("");
        },stream: listenCurrentUser()),
      )
    );
  }
   Future<dynamic> dialogMessages(BuildContext context,OnlineGameController onlineGameController) async {
    return showDialog(
        context: context,
        builder: (context) => AlertDialog(
                title: const Text("Set timer"),
                content: const Text("0 to remove timer"),
                actions: [
                  Padding(
                    padding: const EdgeInsets.symmetric(horizontal: 90),
                    child: TextField(
                      keyboardAppearance: Brightness.light,
                      decoration: const InputDecoration(
                        labelText: "Enter time",
                      ),
                      onChanged: (value) {
                        setState(() {
                          if (value == "") {
                            count = 0;
                            timeSetted=false;
                          } else if (value == "0") {
                            count = 0;
                            timeSetted=false;
                          } else {
                            count = int.parse(value);
                            onlineGameController.setTime(Time(time: count,room: widget.user.room));
                            setState(() {
                              timeSetted=true;
                            });

                          }
                        });
                      },
                    ),
                  ),
                  const SizedBox(
                    height: 10,
                  ),
                  ElevatedButton(
                      onPressed: () {
                        Navigator.pop(context);
                      },
                      child: const Text("Okay"))
                ]));
  }

}
