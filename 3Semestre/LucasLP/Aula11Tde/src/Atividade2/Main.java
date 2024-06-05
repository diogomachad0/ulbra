package Atividade2;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("VW", "Golf");
        System.out.println("Marca veiculo: " + veiculo1.marca + "\nModelo veiculo: " + veiculo1.modelo);

        System.out.println(" ");

        Carro carro1 = new Carro("VW", "Golf", 4);
        System.out.println("Marca carro: " + carro1.marca + "\nModelo carro: " + carro1.modelo +
                "\nNum de Passageiros: " + carro1.numPassageiros);

    }


}



