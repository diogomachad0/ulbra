import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {
        Scanner par = new Scanner(System.in);

        int numero = 1;
        int i = 1;

        System.out.println("Digite um número inteiro e positivo");
        numero = par.nextInt();

        System.out.println("Numeros pares entre 1 e " + numero + ":");

        while(i <= numero){
            if(i% 2 == 0){
                System.out.println(i + " ");
            }
            i++;
        }
    }

}
