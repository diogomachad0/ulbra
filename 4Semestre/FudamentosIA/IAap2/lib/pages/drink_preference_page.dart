import 'package:flutter/material.dart';
import '../data/drink.dart';
import 'drink_list.dart';

class DrinkPreferencePage extends StatefulWidget {
  final List<Drink> drinks;

  DrinkPreferencePage({required this.drinks});

  @override
  _DrinkPreferencePageState createState() => _DrinkPreferencePageState();
}

class _DrinkPreferencePageState extends State<DrinkPreferencePage> {
  String? selectedType;
  String? selectedTaste;
  AlcoholIntensity? selectedAlcoholIntensity;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Text('Selecione suas preferências:'),
            DropdownButton<String>(
              hint: const Text('Tipo de Bebida'),
              value: selectedType,
              onChanged: (newValue) {
                setState(() {
                  selectedType = newValue;
                });
              },
              items: ['Álcool', 'Sem Álcool'].map((type) {
                return DropdownMenuItem(
                  value: type,
                  child: Text(type),
                );
              }).toList(),
            ),
            if (selectedType == "Álcool")
              DropdownButton<AlcoholIntensity>(
                hint: const Text('Teor Alcoólico'),
                value: selectedAlcoholIntensity,
                onChanged: (newValue) {
                  setState(() {
                    selectedAlcoholIntensity = newValue;
                  });
                },
                items: const [
                  DropdownMenuItem(
                    value: AlcoholIntensity.Baixo,
                    child: Text('Baixo'),
                  ),
                  DropdownMenuItem(
                    value: AlcoholIntensity.Medio,
                    child: Text('Médio'),
                  ),
                  DropdownMenuItem(
                    value: AlcoholIntensity.Alto,
                    child: Text('Alto'),
                  ),
                ],
              ),
            DropdownButton<String>(
              hint: Text('Sabor'),
              value: selectedTaste,
              onChanged: (newValue) {
                setState(() {
                  selectedTaste = newValue;
                });
              },
              items: ['Doce', 'Neutra', 'Amarga'].map((taste) {
                return DropdownMenuItem(
                  value: taste,
                  child: Text(taste),
                );
              }).toList(),
            ),
            ElevatedButton(
              onPressed: () {
                List<Drink> filteredDrinks = [];
                for (var drink in widget.drinks) {
                  bool isTypeMatch = selectedType == null || drink.type == selectedType;
                  bool isTasteMatch = selectedTaste == null || drink.taste == selectedTaste;
                  bool isAlcoholIntensityMatch =  true;
                  if (selectedType != null && selectedType == "Álcool") {
                    if (selectedAlcoholIntensity != null &&
                        drink.alcoholIntensity != selectedAlcoholIntensity) {
                      isAlcoholIntensityMatch = false;
                    }
                  }
                  if (isTypeMatch && isTasteMatch && isAlcoholIntensityMatch) {
                    filteredDrinks.add(drink);
                  }
                }
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => DrinkList(drinks: filteredDrinks),
                  ),
                );
              },
              child: Text('Ver Sugestões'),
            ),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => DrinkList(drinks: widget.drinks),
                  ),
                );
              },
              child: Text('Ver Cardápio Completo'),
            ),
          ],
        ),
      ),
    );
  }
}
