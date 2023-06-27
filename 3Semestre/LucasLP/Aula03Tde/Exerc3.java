import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);

        int num = 0;

        System.out.println("Digite um numero inteiro positivo: ");
        num = tabuada.nextInt();

        if(num < 0){
            System.out.println("O numero digitado não é positivo");
        }else{
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }
}
