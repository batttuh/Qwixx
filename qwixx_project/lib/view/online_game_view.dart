

import 'package:flutter/material.dart';
import 'package:qwixx_project/src/generated/proto/src/main/proto/schema.pb.dart';

import '../controller/client_server_controller.dart';
import '../controller/online_game_controller.dart';

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
  @override
  void initState() {
    // TODO: implement initState
    super.initState();
   controller=ClientController();
   onlineGameController=OnlineGameController();


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

    
  

  void nextUser()async{
   await controller.nextUser(widget.user.room);
  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body:  Center(
        child: Column(
          children: [
            SizedBox(
              height: MediaQuery.of(context).size.height*0.7,
              child: StreamBuilder<User>(builder: (context,snapshot){
                if(snapshot.hasData){
                    return Column(children: [
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
                              onTap: () => onlineGameController.disableDice(Dice_Type.blue, snapshot.data!),
                              child:Padding(padding:const EdgeInsets.all(10),child: Image.asset("${snapshot.data!.dices[2].path}blue${snapshot.data!.dices[2].number}.png"),)
                        ))
                        : Container(),
                    snapshot.data!.dices[3].enable
                        ? Flexible(
                            fit: FlexFit.tight,
                            child: InkWell(
                                onTap: () {onlineGameController.disableDice(Dice_Type.green, snapshot.data!);},
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
                                onTap: () => onlineGameController.disableDice(Dice_Type.red, snapshot.data!),
                                child: Padding(padding:const EdgeInsets.all(10),child: Image.asset("${snapshot.data!.dices[4].path}red${snapshot.data!.dices[4].number}.png"),)
                        ))
                        : Container(),
                              snapshot.data!.dices[5].enable
            
                        ? Flexible(
                            fit: FlexFit.tight,
                            child: InkWell(
                                onTap: (() => onlineGameController.disableDice(Dice_Type.yellow, snapshot.data!)),
                                child: Padding(padding:const EdgeInsets.all(10),child: Image.asset("${snapshot.data!.dices[5].path}yellow${snapshot.data!.dices[5].number}.png"),)
                        ))
                        : Container(),
                  ]),
                ),
                Flexible(
                  flex: 1,
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [Flexible(
                      flex: 1,
                      child: snapshot.data!.id==widget.user.id?ElevatedButton(
                        onPressed: () {
                        onlineGameController.rollDice(widget.side,snapshot.data!);
                          setState(() {
                            
                        });                        
                        },
                        style: Theme.of(context).elevatedButtonTheme.style,
                        child: const Text("Roll")):Container(),
                      
                    ),
                    Flexible(
                
                      flex: 1,
                      child: snapshot.data!.id==widget.user.id?ElevatedButton(onPressed: (){
                          setState(() {
                             currentUser=snapshot.data!;
                          });
                          nextUser();
                        },child: const Text("Next User"),):Container(),
                    ),
                    ]
                  ),
                ),
              ]);
            
                }
                return const Text("");
              },stream: listenCurrentUser()),
            ),
        
          

       ] )
        
        
      )
    );
  }
}
