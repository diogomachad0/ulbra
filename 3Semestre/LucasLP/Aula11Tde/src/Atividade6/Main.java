package Atividade6;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.andar();
        pessoa1.falar();

        System.out.println(" ");

        Estudante estudante1 = new Estudante();
        estudante1.andar();
        estudante1.andar();
        estudante1.estudar();
    }
}
