import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {
        Scanner impar = new Scanner(System.in);

        int num = 0;
        int i = 1;

        System.out.println("Digite um numero inteiro e positivo: ");
        num = impar.nextInt();

        System.out.println("Os numeros impares entre 1 e " + num + " são");
        for(i = 1; i <= num; i++){
            if(i % 2 != 0){
                System.out.println(i + " ");
            }
        }
    }
}
