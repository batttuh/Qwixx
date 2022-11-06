import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

import '../core/localization/locale_keys.dart';
import '../core/utils/global.dart';

class RulesView extends StatelessWidget {
  const RulesView({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          systemOverlayStyle: SystemUiOverlayStyle.light,
          title: Text(localizor.tr(LocaleKeys.rules)),
        ),
        body: Padding(
            padding: const EdgeInsets.all(20),
            child: ListView(scrollDirection: Axis.vertical, children: [
              Text(
                localizor.tr(LocaleKeys.title),
                style: Theme.of(context).textTheme.headline3,
              ),
              const inlinePadding(),
              Text(localizor.tr(LocaleKeys.rulesText1),
                  style: Theme.of(context).textTheme.bodyText1),
              const inlinePadding(),
              SizedBox(
                  height: 150,
                  width: MediaQuery.of(context).size.width,
                  child: Row(
                      mainAxisAlignment: MainAxisAlignment.spaceAround,
                      children: [
                        Image.asset("assets/image/rule1.jpg"),
                        Image.asset("assets/image/rule2.jpg")
                      ])),
              const inlinePadding(),
              Text(
                localizor.tr(LocaleKeys.title2),
                style: Theme.of(context).textTheme.headline6,
              ),
              const inlinePadding(),
              Text(localizor.tr(LocaleKeys.rulesText2),
                  style: Theme.of(context).textTheme.bodyText1),
              const inlinePadding(),
              SizedBox(
                height: 150,
                width: MediaQuery.of(context).size.width,
                child: Image.asset("assets/image/rules3.jpg"),
              ),
              Text(
                localizor.tr(LocaleKeys.title3),
                style: Theme.of(context).textTheme.headline6,
              ),
              const inlinePadding(),
              Text(localizor.tr(LocaleKeys.rulesText3),
                  style: Theme.of(context).textTheme.bodyText1),
              const inlinePadding(),
              Text(
                localizor.tr(LocaleKeys.title4),
                style: Theme.of(context).textTheme.headline6,
              ),
              const inlinePadding(),
              Text(localizor.tr(LocaleKeys.rulesText4),
                  style: Theme.of(context).textTheme.bodyText1),
              const inlinePadding(),
              SizedBox(
                height: 150,
                width: MediaQuery.of(context).size.width,
                child: Image.asset("assets/image/rules4.jpg"),
              ),
              const inlinePadding(),
              Text(
                localizor.tr(LocaleKeys.title5),
                style: Theme.of(context).textTheme.headline6,
              ),
              const inlinePadding(),
              Text(localizor.tr(LocaleKeys.rulesText5),
                  style: Theme.of(context).textTheme.bodyText1),
              const inlinePadding(),
              Text(
                localizor.tr(LocaleKeys.title6),
                style: Theme.of(context).textTheme.headline6,
              ),
              const inlinePadding(),
              Text(localizor.tr(LocaleKeys.rulesText6),
                  style: Theme.of(context).textTheme.bodyText1),
              const inlinePadding(),
            ])));
  }
}

class inlinePadding extends StatelessWidget {
  const inlinePadding({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const SizedBox(height: 20);
  }
}
