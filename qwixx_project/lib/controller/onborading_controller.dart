import 'package:flutter/material.dart';
import 'package:qwixx_project/core/utils/global.dart';
import 'package:qwixx_project/model/onboarding_model.dart';
import 'package:shake/shake.dart';

import '../core/localization/locale_keys.dart';

class OnboardingController extends ChangeNotifier {
  int currentPage = 0;
  OnboardingController();
  PageController pageController = PageController(initialPage: 0);
  void forward() {
    if (currentPage < onboardingPages.length - 1) {
      currentPage++;

      pageController.nextPage(
          duration: const Duration(milliseconds: 600), curve: Curves.easeIn);

      notifyListeners();
    }
  }

  void listenShake(ShakeDetector shakeDetector) {
    shakeDetector.startListening();
  }

  void updatePage(int index) {
    currentPage = index;
    notifyListeners();
  }

  List<OnboardingModel> onboardingPages = [
    OnboardingModel(
      animationAsset: "assets/animation/dice.json",
      title: localizor.tr(LocaleKeys.title1OnBoard),
      description: localizor.tr(LocaleKeys.description1),
    ),
    OnboardingModel(
      animationAsset: "assets/animation/bulb.json",
      title: localizor.tr(LocaleKeys.title2OnBoard),
      description: localizor.tr(LocaleKeys.description2),
    ),
    OnboardingModel(
      animationAsset: "assets/animation/shakePhone.json",
      title: localizor.tr(LocaleKeys.title3OnBoard),
      description: localizor.tr(LocaleKeys.description3),
    ),
  ];
}
