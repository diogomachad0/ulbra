public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro();
        livro1.setTitulo("O pequeno principe");
        livro1.setAutor("Antonie de Saint");
        livro1.setAnoPublicacao(2001);
        livro1.setDisponibilidade(true);
        livro1.detalhesProduto();
        biblioteca.adicionarLivro(livro1);

        System.out.println();

        Livro livro2 = new Livro();
        livro2.setTitulo("Em busca do tempo perdido");
        livro2.setAutor("Marcel Proust");
        livro2.setAnoPublicacao(1998);
        livro2.setDisponibilidade(true);
        livro2.detalhesProduto();
        biblioteca.adicionarLivro(livro2);

        System.out.println();

        Livro livro3 = new Livro();
        livro3.setTitulo("Dom Quixote");
        livro3.setAutor("Miguel Cervantes");
        livro3.setAnoPublicacao(2005);
        livro3.setDisponibilidade(true);
        livro3.detalhesProduto();
        biblioteca.adicionarLivro(livro3);

        System.out.println();

        Livro livro4 = new Livro();
        livro4.setTitulo("Guerra e Paz");
        livro4.setAutor("Lev Tolstói");
        livro4.setAnoPublicacao(1980);
        livro4.setDisponibilidade(true);
        livro4.detalhesProduto();
        biblioteca.adicionarLivro(livro4);

        System.out.println();

        Livro livro5 = new Livro();
        livro5.setTitulo("O grande Gatsby");
        livro5.setAutor("Scott Fitzgerald");
        livro5.setAnoPublicacao(2000);
        livro5.setDisponibilidade(false);
        livro5.detalhesProduto();
        biblioteca.adicionarLivro(livro5);

        System.out.println();
        //adicionar mais um livro para lotar a biblioteca
        biblioteca.adicionarLivro(livro1);

        System.out.println();
        //verificar disponibilidade
        biblioteca.verificarDisponibilidade(livro3);

        System.out.println();

        biblioteca.atualizarDetalhesLivro(livro1, "Novo titulo", "Novo autor", 2020, false);
        livro1.detalhesProduto();

        System.out.println();

        //remove um livro
        //biblioteca.removerLivro(livro3);
    }
}