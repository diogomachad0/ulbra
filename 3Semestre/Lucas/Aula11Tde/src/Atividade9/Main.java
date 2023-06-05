package Atividade9;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Diogo", "Rua A");
        System.out.println("Nome da pessoa: " + pessoa1.nome + "\nEndereço da pessoa: " + pessoa1.endereco);

        System.out.println(" ");

        Cliente cliente1 = new Cliente("Diogo", "Rua A", 1234);
        System.out.println("Nome do cliente: " + cliente1.nome + "\nEndereço do cliente: " + cliente1.endereco +
                "\nNumero cartão: " + cliente1.numeroCartao);
    }
}
