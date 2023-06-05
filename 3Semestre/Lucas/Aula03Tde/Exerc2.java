import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {
        Scanner prim = new Scanner(System.in);

        int num = 0;

        System.out.print("Digite um número inteiro positivo: ");
        num = prim.nextInt();

        boolean primo = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if(primo) {
            System.out.println(num + " é um número primo.");
        }
        else {
            System.out.println(num + " não é um número primo.");
        }
    }
}

