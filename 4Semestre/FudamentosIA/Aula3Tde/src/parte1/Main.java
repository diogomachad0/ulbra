package parte1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso 1:");
        double weight1 = scanner.nextDouble();

        System.out.println("Digite o peso 2:");
        double weight2 = scanner.nextDouble();

        System.out.println("Escolha a função de ativação:");
        System.out.println("1 - Limite Rápido");
        System.out.println("2 - Função Rampa");
        System.out.println("3 - Função Sigmoide");

        int choice = scanner.nextInt();
        double input1, input2, output;

        System.out.println("Digite o valor da entrada 1:");
        input1 = scanner.nextDouble();

        System.out.println("Digite o valor da entrada 2:");
        input2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                output = limitFunction(weight1 * input1 + weight2 * input2);
                break;
            case 2:
                output = rampFunction(weight1 * input1 + weight2 * input2);
                break;
            case 3:
                output = sigmoidFunction(weight1 * input1 + weight2 * input2);
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        System.out.println("Saída calculada: " + output);

        scanner.close();
    }

    // Limite Rápido
    public static double limitFunction(double x) {
        if (x > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    // Função Rampa
    public static double rampFunction(double x) {
        if (x > 0) {
            return x;
        } else {
            return 0;
        }
    }

    // Função Sigmoide
    public static double sigmoidFunction(double x) {
        if (x > 0){
            return 1 -1/(1 + x);
        } else if(x < 0){
            return -1 +1/(1 - x);
        }
        return x;
    }
}
