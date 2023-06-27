package Atividade05;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 49.90);
        livro.exibirDetalhes();
        System.out.println("Preço total: R$" + livro.calcularPreco());

        System.out.println(" ");

        Roupa roupa = new Roupa("Camiseta", "M", 29.90);
        roupa.exibirDetalhes();
        System.out.println("Preço total: R$" + roupa.calcularPreco());

        System.out.println(" ");

        Eletronico eletronico = new Eletronico("Smartphone", "Samsung", 1999.90);
        eletronico.exibirDetalhes();
        System.out.println("Preço total: R$" + eletronico.calcularPreco());
    }
}