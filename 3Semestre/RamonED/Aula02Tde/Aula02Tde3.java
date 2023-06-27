import java.util.Scanner;

public class Aula02Tde3 {

    public static void main(String[] args) {
        Scanner conjunto = new Scanner(System.in);

        String[] alunos = new String[3];
        double[] notas = new double[3];
        double media = 0;
        int i = 0;

        for(i = 0; i<3; i++){
            System.out.println("Digite o nome do aluno: " + (i+1) + ": ");
            alunos[i] = conjunto.nextLine();
            System.out.println("Digite a nota do aluno: " + (i+1) + ": ");
            notas[i] = conjunto.nextDouble();
            conjunto.nextLine();
            media = media + notas[i];
        }
        media = media/3;


        for(i = 0; i<3; i++){
            if(notas[i] > media){
                System.out.println("Alunos com a media acima: " + alunos[i]);
            }
        }
    }
}
