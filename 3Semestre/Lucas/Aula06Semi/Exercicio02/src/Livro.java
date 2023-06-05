public class Livro {
    public String titulo;
    public String autor;
    public String editora;
    public int paginas;

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("N° de paginas: " + paginas);
    }

}
