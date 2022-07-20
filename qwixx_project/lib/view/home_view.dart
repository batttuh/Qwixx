import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:qwixx_project/view/rules_view.dart';
import 'package:shared_preferences/shared_preferences.dart';

import '../controller/theme_controller.dart';

class HomeView extends StatefulWidget {
  const HomeView({Key? key}) : super(key: key);

  @override
  State<HomeView> createState() => _HomeViewState();
}

class _HomeViewState extends State<HomeView> {
  PageController controller = PageController();
  @override
  initState() {
    // TODO: implement initState
    super.initState();
    location();
  }

  void location() async {
    SharedPreferences preferences = await SharedPreferences.getInstance();
    preferences.setString('locations', "HomeScreen");
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: Padding(
      padding: const EdgeInsets.all(20),
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          SizedBox(
              width: MediaQuery.of(context).size.width,
              child: Image.asset(fit: BoxFit.cover, "assets/image/qwixx.jfif")),
          const ButtonsRowWidget(),
          Padding(
            padding: const EdgeInsets.only(top: 50),
            child: ElevatedButton(
              style: Theme.of(context).elevatedButtonTheme.style,
              child: const Text("Theme Change"),
              onPressed: () async {
                context.read<ChangeTheme>().changeTheme();
                final prefs = await SharedPreferences.getInstance();
                await prefs.setBool(
                    'darkMode', context.read<ChangeTheme>().isLight);
              },
            ),
          ),
        ],
      ),
    ));
  }
}

class ButtonsRowWidget extends StatelessWidget {
  const ButtonsRowWidget({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(top: 80),
      child: Row(
        children: const [
          StartGameButtonWidget(),
          RulesButtonWidget(),
        ],
      ),
    );
  }
}

class RulesButtonWidget extends StatelessWidget {
  const RulesButtonWidget({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Expanded(
      child: ElevatedButton(
        style: Theme.of(context).elevatedButtonTheme.style,
        child: const Text("Rules"),
        onPressed: () {
          Navigator.push(
            context,
            MaterialPageRoute(
              builder: (context) => const RulesView(),
            ),
          );
        },
      ),
    );
  }
}

class StartGameButtonWidget extends StatelessWidget {
  const StartGameButtonWidget({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Expanded(
      child: ElevatedButton(
        style: Theme.of(context).elevatedButtonTheme.style,
        child: const Text("Start Game"),
        onPressed: () {
          Navigator.pushNamed(context, "/game");
        },
      ),
    );
  }
}
