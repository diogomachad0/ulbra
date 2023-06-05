import java.util.Random;

public class Matriz{

    private static Random aleatorio = new Random();
    private static int[][] matriz = new int[100][100];

    public static void main(String[] args) {
        gerarMatriz();
        imprimirMatriz();

        padroesEncontrados("01");
        padroesEncontrados("10");
        padroesEncontrados("11");
    }

    private static void gerarMatriz()
    {
        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 100; j++){
                matriz[i][j] = aleatorio.nextInt(2);
            }
        }
    }

    private static void imprimirMatriz()
    {
        for (int i = 0; i < 100; i ++){
            for (int j = 0; j < 100; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void padroesEncontrados(String padrao)
    {
        long incio = System.currentTimeMillis();

        int result = 0;
        for (int i = 0; i < 100; i++){
            String row = "";
            String col = "";
            for (int j = 0; j < 100; j++) {
                row = row + matriz[i][j];
                col = col + matriz[j][i];
            }
            result = result + row.split("(?<=(" + padrao + "))", -1).length - 1;
            result = result + col.split("(?<=(" + padrao + "))", -1).length - 1;
        }
        System.out.println("Padrão " + padrao + ": " + result + " vezes");

        long fim = System.currentTimeMillis();
        System.out.println("Tempo na busca: " + (fim - incio) + "ms");
    }

}