import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args) {
        Scanner par = new Scanner(System.in);

        int num = 0;
        int cont = 1;

        System.out.println("Digite um numero inteiro e positivo: ");
        num = par.nextInt();

        while(cont <= num){
            if(cont % 2 == 0){
                System.out.println(cont);
            }
            cont++;
        }
    }
}
