enum AlcoholIntensity { Baixo, Medio, Alto }

class Drink {
  final String name;
  final String description;
  final String type;
  final String taste;
  final AlcoholIntensity alcoholIntensity;

  Drink(this.name, this.description, this.type, this.taste, this.alcoholIntensity);
}
