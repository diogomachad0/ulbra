import 'package:flutter/material.dart';
import 'package:teste/pages/drink_preference_page.dart';

import 'data/drink.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  final List<Drink> drinks = [
    Drink("Margarita", "Tequila, Cointreau, limão, sal", "Álcool", "Amarga", AlcoholIntensity.Medio),
    Drink("Mojito", "Rum, hortelã, limão, açúcar, água com gás", "Álcool", "Doce", AlcoholIntensity.Alto),
    Drink("Virgin Mojito", "Hortelã, limão, açúcar, água com gás", "Sem Álcool", "Doce, AlcoholIntensity.Alto", AlcoholIntensity.Baixo),
    Drink("Limonada", "Limão, açúcar, água", "Sem Álcool", "Doce", AlcoholIntensity.Baixo),
    Drink("Água com gás", "Água, dióxido de carbono", "Sem Álcool", "Amarga", AlcoholIntensity.Baixo),
    Drink("Refrigerante", "Água, extratos da fruta, açúcar, edulcorantes, aromatizantes, corantes, acidulantes, conservantes e anidrido carbônico (CO2)", "Sem Álcool", "Doce", AlcoholIntensity.Baixo),
    Drink("Manhattan", "Curaçau, whisky, dose de vermute", "Álcool", "Doce", AlcoholIntensity.Alto),
    Drink("Água sem gás", "H2o", "Sem Álcool", "Neutra", AlcoholIntensity.Baixo),
    Drink("Coquetel de absinto", "Absinto, hortelã, xarópe de açucar", "Álcool", "Amarga", AlcoholIntensity.Alto),
    Drink("Martini & soda", "Martini, água com gás, rodelas de laranja", "Álcool", "Doce", AlcoholIntensity.Baixo),
  ];

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Sugestão de Bebidas'),
        ),
        body: Container(
            decoration: BoxDecoration(
              image: DecorationImage(
                image: AssetImage("assets/images.barman.jpg"), // substitua pelo caminho da sua imagem
                fit: BoxFit.cover,
              ),
            ),
            child: DrinkPreferencePage(drinks: drinks)),
      ),
    );
  }
}
