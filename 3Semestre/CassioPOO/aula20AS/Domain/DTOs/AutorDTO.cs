namespace aula20AS.Domain.DTOs
{
    public class AutorDTO
    {
        public int Id { get; set; }
        public string Nome { get; set; }
        public List<int> LivrosIds { get; set; }
    }
}