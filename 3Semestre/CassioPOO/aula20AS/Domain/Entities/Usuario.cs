namespace aula20AS.Domain.Entities
{
    public class Usuario
    {
        public int Id { get; set; }
        public string Nome { get; set; }
        public ICollection<Emprestimo> Emprestimos { get; set; }
    }
}