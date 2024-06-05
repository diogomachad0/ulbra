import java.util.Scanner;

public class Aula02Tde2 {

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        System.out.println("Digite a nota média: ");
        int j = usuario.nextInt();
        double[] notas = new double[j];
        double media = 0;
        int i = 0;
        for(i = 0; i<j; i++){
            System.out.println("Digite a nota: " + (i+1) + ": ");
            notas[i] = usuario.nextDouble();
            media = media + notas[i];
        }
        media = media/j;
        System.out.println("Notas maiores que a da média: ");
        for(i = 0; i<j; i++){
            if(notas[i] > media){
                System.out.println(notas[i] + "");
            }
        }
        System.out.println("Notas menores que a da média: ");
        for(i = 0; i<j; i++){
            if(notas[i] < media){
                System.out.println(notas[i]+ "");
            }
        }
    }
}
