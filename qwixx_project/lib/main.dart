import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter_phoenix/flutter_phoenix.dart';
// ignore: depend_on_referenced_packages
import 'package:provider/provider.dart';
import 'package:qwixx_project/controller/onborading_controller.dart';
import 'package:shared_preferences/shared_preferences.dart';

import 'controller/game_controller.dart';
import 'controller/theme_controller.dart';
import 'core/ioc/locator.dart';
import 'core/localization/localizor.dart';
import 'core/utils/global.dart';
import 'presentation/app/qwiix_app.dart';

void main() {
  runZonedGuarded(
    () async {
      WidgetsFlutterBinding.ensureInitialized();

      IOCModule.initializeLocator();
      await localizor.initialize();

      SharedPreferences.getInstance().then((prefs) {
        var darkModeOn = prefs.getBool('darkMode') ?? true;
        runApp(MultiProvider(
          providers: [
            ChangeNotifierProvider<ChangeTheme>(
                create: (context) => ChangeTheme(darkModeOn)),
            ChangeNotifierProvider<EightSideDiceController>(
                create: (context) => EightSideDiceController()),
            ChangeNotifierProvider<OnboardingController>(
                create: (context) => OnboardingController()),
          ],
          child: DynamicLocalization(
            path: "assets/translations",
            supportedLocales: LocalizationConfig.supportedLocales,
            fallbackLocale: LocalizationConfig.enUS,
            saveLocale: true,
            child: Phoenix(child: const MyApp()),
          ),
        ));
      });
    },
    (error, stack) {
      print(error);
    },
  );
}
