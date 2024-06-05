package Atividade05;

public class Roupa extends Produto {
    private String descricao;
    private String tamanho;
    private double preco;

    public Roupa(String descricao, String tamanho, double preco) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public double calcularPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Roupa: " + descricao);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: R$" + preco);
    }
}

