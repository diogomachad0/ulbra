public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 82.90, 50);

        Produto produto2 = new Produto("Calça", 59.90, 30);
        Produto produto3 = new Produto("Tênis", 99.90, 20);

        Loja loja = new Loja();
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);

        loja.listarProdutos();


        loja.venderProduto(produto1, 1);

        Produto produtoEstoque = produto2;
        int quantidadeEstoque = 1;
        loja.adicionarEstoque(produtoEstoque, quantidadeEstoque);

        loja.removerProduto(produto3);

        loja.listarProdutos();
    }
}
