package Atividade7;

public class ProdutoPerecivel extends Produto{
    String dataValidade;

    public ProdutoPerecivel(int codigo, int preco, String dataValidade){
        super(codigo, preco);
        this.dataValidade = dataValidade;
    }
}
