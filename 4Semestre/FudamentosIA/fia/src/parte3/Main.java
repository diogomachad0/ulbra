package parte3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso 1 do primeiro neurônio:");
        double weight1_neuron1 = scanner.nextDouble();

        System.out.println("Digite o peso 1 do segundo neurônio:");
        double weight1_neuron2 = scanner.nextDouble();

        System.out.println("Digite o peso 2 do primeiro neurônio:");
        double weight2_neuron1 = scanner.nextDouble();

        System.out.println("Digite o peso 2 do segundo neurônio:");
        double weight2_neuron2 = scanner.nextDouble();

        System.out.println("Escolha a função de ativação:");
        System.out.println("1 - Limite Rápido");
        System.out.println("2 - Função Rampa");
        System.out.println("3 - Função Sigmoide");

        int choice = scanner.nextInt();
        double input1, input2, output_neuron1, output_neuron2;

        System.out.println("Digite o valor da entrada 1:");
        input1 = scanner.nextDouble();

        // Primeiro neurônio
        output_neuron1 = calculateNeuronOutput(input1, weight1_neuron1, weight2_neuron1, choice);

        // Segundo neurônio
        output_neuron2 = calculateNeuronOutput(output_neuron1, weight1_neuron2, weight2_neuron2, choice);

        System.out.println("Saída do primeiro neurônio: " + output_neuron1);
        System.out.println("Saída do segundo neurônio: " + output_neuron2);

        scanner.close();
    }

    public static double calculateNeuronOutput(double input, double weight1, double weight2, int choice) {
        double weightedSum = weight1 * input + weight2;
        switch (choice) {
            case 1:
                return limitFunction(weightedSum);
            case 2:
                return rampFunction(weightedSum);
            case 3:
                return sigmoidFunction(weightedSum);
            default:
                System.out.println("Escolha inválida.");
                return 0;
        }
    }

    // Limite Rápido
    public static double limitFunction(double x) {
        return x > 0 ? 1 : -1;
    }

    // Função Rampa
    public static double rampFunction(double x) {
        return x > 0 ? x : 0;
    }

    // Função Sigmoide
    public static double sigmoidFunction(double x) {
        return 1 / (1 + Math.exp(-x));
    }
}
