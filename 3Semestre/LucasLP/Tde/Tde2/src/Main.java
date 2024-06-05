public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("fazendinha", "Bita", 90);
        Livro livro2 = new Livro("grêmio", "Luis");

        System.out.println("Título: " + livro1.titulo + " | Autor: " + livro1.getAutor() + " | R$" + livro1.preco);
        System.out.println("Título: " + livro2.titulo + " | Autor: " + livro2.getAutor() + " | R$" + livro2.preco);

    }
}
