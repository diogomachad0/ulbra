package parte4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de entradas:");
        int numInputs = scanner.nextInt();

        double[] weightsNeuron1 = new double[numInputs];
        double[] weightsNeuron2 = new double[numInputs];

        for (int i = 0; i < numInputs; i++) {
            System.out.println("Digite o peso " + (i + 1) + " do primeiro neurônio:");
            weightsNeuron1[i] = scanner.nextDouble();

            System.out.println("Digite o peso " + (i + 1) + " do segundo neurônio:");
            weightsNeuron2[i] = scanner.nextDouble();
        }

        System.out.println("Escolha a função de ativação:");
        System.out.println("1 - Limite Rápido");
        System.out.println("2 - Função Rampa");
        System.out.println("3 - Função Sigmoide");

        int choice = scanner.nextInt();
        double[] inputs = new double[numInputs];
        double[] outputs = new double[2];

        for (int i = 0; i < numInputs; i++) {
            System.out.println("Digite o valor da entrada " + (i + 1) + ":");
            inputs[i] = scanner.nextDouble();
        }

        // Primeiro neurônio
        outputs[0] = calculateNeuronOutput(inputs, weightsNeuron1, choice);

        // Segundo neurônio
        outputs[1] = calculateNeuronOutput(outputs, weightsNeuron2, choice);

        System.out.println("Saída do primeiro neurônio: " + outputs[0]);
        System.out.println("Saída do segundo neurônio: " + outputs[1]);

        scanner.close();
    }

    public static double calculateNeuronOutput(double[] inputs, double[] weights, int choice) {
        double weightedSum = 0;
        for (int i = 0; i < inputs.length; i++) {
            weightedSum += weights[i] * inputs[i];
        }

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
