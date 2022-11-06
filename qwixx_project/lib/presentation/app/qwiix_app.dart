import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:qwixx_project/core/utils/global.dart';

import '../../controller/theme_controller.dart';
import '../../core/localization/locale_keys.dart';
import '../../view/splashScreen.dart';

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      onGenerateTitle: (_) => localizor.tr(LocaleKeys.appTitle),
      // Localization
      localizationsDelegates: localizor.getLocalizationDelegates(context),
      supportedLocales: localizor.getSupportedLocales(context),
      locale: localizor.getLocale(context),
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: context.watch<ChangeTheme>().currentTheme,
      home: SplashScreen(),
    );
  }
}
