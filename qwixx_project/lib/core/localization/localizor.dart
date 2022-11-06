import 'package:easy_localization/easy_localization.dart';
import 'package:easy_logger/easy_logger.dart';
import 'package:flutter/widgets.dart';

/// A tool to handle localization over the course of the app lifecycle.
abstract class Localizor {
  /// To be called in main before runApp.
  Future<void> initialize();

  /// Gets localization delegates to be used in MaterialApp widget.
  List<LocalizationsDelegate<dynamic>> getLocalizationDelegates(
    BuildContext context,
  );

  /// Gets all the supported Locales.
  List<Locale> getSupportedLocales(BuildContext context);

  /// Gets the current Locale.
  Locale getLocale(BuildContext context);

  /// Changes the current Locale with the given one and rebuilds the app.
  Future<void> changeLocale(BuildContext context, Locale newLocale);

  /// Translates the given [text] with [args] if provided.
  String translate(String text, {List<String>? args});

  /// Short version of the [translate] method.
  String tr(String text, {List<String>? args});
}

/// Localizor Implementation
class LocalizorImpl implements Localizor {
  @override
  Future<void> initialize() {
    EasyLocalization.logger.enableLevels = const <LevelMessages>[
      LevelMessages.error,
      LevelMessages.warning,
    ];
    return EasyLocalization.ensureInitialized();
  }

  @override
  List<LocalizationsDelegate<dynamic>> getLocalizationDelegates(
    BuildContext context,
  ) {
    return context.localizationDelegates;
  }

  @override
  List<Locale> getSupportedLocales(BuildContext context) {
    return context.supportedLocales;
  }

  @override
  Locale getLocale(BuildContext context) {
    return context.locale;
  }

  @override
  Future<void> changeLocale(BuildContext context, Locale newLocale) {
    return context.setLocale(newLocale);
  }

  @override
  String translate(String text, {List<String>? args}) {
    return text.tr(args: args);
  }

  @override
  String tr(String text, {List<String>? args}) {
    return translate(text, args: args);
  }
}

class DynamicLocalization extends EasyLocalization {
  DynamicLocalization({
    super.key,
    Locale? startLocale,
    required super.child,
    required super.path,
    required super.supportedLocales,
    super.fallbackLocale,
    bool? useOnlyLangCode,
    bool? saveLocale,
  }) : super(
          useOnlyLangCode: useOnlyLangCode ?? false,
          saveLocale: saveLocale ?? false,
        );
}

abstract class LocalizationConfig {
  // Provide a new Locale here when supported.
  static const enUS = Locale('en', 'US');
  static const trTR = Locale("tr", "TR");

  // Update this list if a new Locale is supported.
  static List<Locale> get supportedLocales => [enUS, trTR];
}
