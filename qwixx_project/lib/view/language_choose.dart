import 'package:flutter/material.dart';
import 'package:qwixx_project/core/utils/global.dart';

import '../core/localization/locale_keys.dart';
import 'onboarding_view.dart';

class LanguageChoose extends StatefulWidget {
  const LanguageChoose({Key? key}) : super(key: key);

  @override
  State<LanguageChoose> createState() => _LanguageChooseState();
}

class _LanguageChooseState extends State<LanguageChoose> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Column(mainAxisAlignment: MainAxisAlignment.center, children: [
        Padding(
          padding: const EdgeInsets.only(bottom: 100),
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              InkWell(
                  onTap: (() {
                    localizor.changeLocale(
                        context, localizor.getSupportedLocales(context)[0]);
                  }),
                  child: const Tooltip(
                    message: "English",
                    child: CircleAvatar(
                        minRadius: 80,
                        backgroundImage:
                            AssetImage("assets/image/english.png")),
                  )),
              InkWell(
                  onTap: () {
                    localizor.changeLocale(
                        context, localizor.getSupportedLocales(context)[1]);
                  },
                  child: const Tooltip(
                    message: "Türkçe",
                    child: CircleAvatar(
                        minRadius: 80,
                        backgroundImage: AssetImage("assets/image/tr.png")),
                  ))
            ],
          ),
        ),
        Text(localizor.tr(LocaleKeys.language),
            style: const TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            textAlign: TextAlign.center),
        Padding(
          padding: const EdgeInsets.only(top: 40, right: 5, left: 5),
          child: ElevatedButton(
              onPressed: () {
                Navigator.pushReplacement(
                    context,
                    MaterialPageRoute(
                        builder: (context) => const FirstOnboardingScreen()));
              },
              child: Text(localizor.tr(LocaleKeys.chooseLangPage))),
        )
      ]),
    );
  }
}
