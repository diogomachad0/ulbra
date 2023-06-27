namespace aula20AS.Domain.Entities
{
    public class Autor
    {
         public int Id { get; set; }
        public string Nome { get; set; }
        public ICollection<LivroAutor> Livros { get; set; }
    }
}