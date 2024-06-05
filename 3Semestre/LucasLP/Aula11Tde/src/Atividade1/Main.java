package Atividade1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Diogo", 20);
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);

        System.out.println(" ");

        Funcionario funcionario1 = new Funcionario("Scheila", 20, "Dev");
        System.out.println("Nome do funcionario: " + funcionario1.nome);
        System.out.println("Idade: " + funcionario1.idade);
        System.out.println("Cargo: " + funcionario1.cargo);
    }
}