import 'package:get_it/get_it.dart';

import '../localization/localizor.dart';

final locator = GetIt.instance;

abstract class IOCModule {
  static void initializeLocator() {
    // Logger
    locator.registerLazySingleton<Localizor>(
      () => LocalizorImpl(),
    );
  }
}
