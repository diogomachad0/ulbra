package Atividade05;

public class Main {
    public static void main(String[] args) {
        int[] numerosImpares = new int[10];

        int contador = 0;

        for (int i = 1; contador < 10; i++) {
            if (i % 2 == 1) {
                numerosImpares[contador] = i;
                contador++;
            }
        }

        for (int i = 0; i < numerosImpares.length; i++) {
            System.out.println(numerosImpares[i]);
        }
    }
}