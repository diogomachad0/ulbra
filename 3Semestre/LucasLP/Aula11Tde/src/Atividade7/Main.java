package Atividade7;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, 15.00);
        System.out.println("Codigo do produto: " + produto1.codigo + "\nPreço do produto: " + produto1.preco);

        System.out.println(" ");

        ProdutoPerecivel perecivel = new ProdutoPerecivel(1, 15, "03/06/2023");
        System.out.println("Codigo produto perecivel: " + perecivel.codigo +
                "\nPreço produto perecivel: " + perecivel.preco +
                "\nData validade produto perecivel: " + perecivel.dataValidade);

    }
}
