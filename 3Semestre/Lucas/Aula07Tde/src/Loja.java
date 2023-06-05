public class Loja {
    public Produto produto1;
    public Produto produto2;
    public Produto produto3;

    public void adicionarProduto(Produto produto) {
        if (produto1 == null) {
            produto1 = produto;
        } else if (produto2 == null) {
            produto2 = produto;
        } else if (produto3 == null) {
            produto3 = produto;
        } else {
            System.out.println("Não é possivel adicionar mais produtos!");
        }
    }

    public void removerProduto(Produto produto){
        if(produto1 == null){
            produto1 = produto;
        }else if(produto2 == null){
            produto2 = produto;
        }else if(produto3 == null){
            produto3 = produto;
        }
    }

    public void listarProdutos() {
        System.out.println("Produtos disponiveis:");
        if (produto1 != null) {
            System.out.println(" " + produto1.getNome());
        }
        if (produto2 != null) {
            System.out.println(" " + produto2.getNome());
        }
        if (produto3 != null) {
            System.out.println(" " + produto3.getNome());
        }
    }

    public void venderProduto(Produto produto, int quantidade) {
        if (produto != null) {
            if (produto.getQuantidade() >= quantidade) {
                produto.setQuantidade(produto.getQuantidade() - quantidade);
                System.out.println("Venda feita");
            } else {
                System.out.println("Estoque zerado");
            }
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public void adicionarEstoque(Produto produto, int quantidade){
        if(produto != null){
            produto.setQuantidade(produto.getQuantidade() + quantidade);
            System.out.println("Estoque atualizado com sucesso");
        }else{
            System.out.println("Produto não encontrado");
        }
    }
}
