import java.util.Scanner;
public class Aula02Tde {

    public static void main(String[] args) {
        Scanner turma = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] notas = new double[5];
        double media = 0;

        for (int i = 0; i<5; i++){
            System.out.println("Digite o nome do aluno: " + (i+1) + ": ");
            nomes[i] = turma.nextLine();
            System.out.println("Digite a nota do aluno: " + (i+1) + ": ");
            notas[i] = turma.nextDouble();
            turma.nextLine();
            media = media + notas[i];
        }

        media = media/5;
        System.out.println("Média da turma: " + media);

        System.out.println("Alunos com a nota acima da média: ");

        for(int i = 0; i<5; i++){
            if (notas[i] > media){
                System.out.println(nomes[i] + " - " + notas[i]);
            }
        }
    }
}
