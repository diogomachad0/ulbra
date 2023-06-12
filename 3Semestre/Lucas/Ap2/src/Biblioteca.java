public class Biblioteca {
    private Livro livro1;
    private Livro livro2;
    private Livro livro3;
    private Livro livro4;
    private Livro livro5;

    public void adicionarLivro(Livro livro) {
        if (livro1 == null) {
            livro1 = livro;
            System.out.println("Livro 1 adicionado a biblioteca");
        } else if (livro2 == null) {
            livro2 = livro;
            System.out.println("Livro 2 adicionado a biblioteca");
        } else if (livro3 == null) {
            livro3 = livro;
            System.out.println("Livro 3 adicionado a biblioteca");
        } else if (livro4 == null) {
            livro4 = livro;
            System.out.println("Livro 4 adicionado a biblioteca");
        } else if (livro5 == null) {
            livro5 = livro;
            System.out.println("Livro 5 adicionado a biblioteca");
        } else {
            System.out.println("A biblioteca está lotada. Não é possível adicionar mais livros!");
        }
    }

    public void removerLivro(Livro livro) {
        if (livro1 == livro) {
            livro1 = null;
            System.out.println("Livro 1 removido");
        } else if (livro2 == livro) {
            livro2 = null;
            System.out.println("Livro 2 removido");
        } else if (livro3 == livro) {
            livro3 = null;
            System.out.println("Livro 3 removido");
        } else if (livro4 == livro) {
            livro4 = null;
            System.out.println("Livro 4 removido");
        } else if (livro5 == livro) {
            livro5 = null;
            System.out.println("Livro 5 removido");
        } else {
            System.out.println("Livro não encontrado na biblioteca!");
        }
    }

    public void atualizarDetalhesLivro(Livro livro, String titulo, String autor, int anoPublicacao, boolean disponibilidade) {
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setAnoPublicacao(anoPublicacao);
        livro.setDisponibilidade(disponibilidade);
    }

    public void verificarDisponibilidade(Livro livro) {
        if (livro.isDisponibilidade()) {
            System.out.println("O livro -> " + livro.getTitulo() + " <- está disponível");
        } else {
            System.out.println("O livro -> " + livro.getTitulo() + " <- não está disponível!");
        }
    }
}
