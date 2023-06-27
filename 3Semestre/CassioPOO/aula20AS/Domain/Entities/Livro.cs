namespace aula20AS.Domain.Entities
{
    public class Livro
    {
        public int Id { get; set; }
        public string Titulo { get; set; }
        public bool Emprestado { get; set; }
        public ICollection<LivroAutor> Autores { get; set; }
    }
}