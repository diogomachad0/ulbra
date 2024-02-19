import 'package:flutter/material.dart';
import '../data/drink.dart';

class DrinkList extends StatelessWidget {
  final List<Drink> drinks;

  DrinkList({required this.drinks});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Sugestões de Bebidas'),
      ),
      body: ListView.builder(
        itemCount: drinks.length,
        itemBuilder: (context, index) {
          return ListTile(
            title: Text(drinks[index].name),
            subtitle: Text(drinks[index].description),
          );
        },
      ),
    );
  }
}
