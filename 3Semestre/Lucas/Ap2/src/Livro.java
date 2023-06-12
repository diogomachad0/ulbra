public class Livro extends Produto {
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;

    public String getAutor() {

        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public int getAnoPublicacao() {

        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {

        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponibilidade() {

        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {

        this.disponibilidade = disponibilidade;
    }

    public void detalhesProduto() {
        System.out.println("Detalhes do livro:" +
                "\nTitulo: " + getTitulo() +
                "\nAutor: " + autor +
                "\nAno publicação: " + anoPublicacao +
                "\nDisponibilidade: " + (disponibilidade ? "Disponivel!" : "Não disponivel!"));
    }
}
