namespace aula20AS.Domain.DTOs
{
    public class UsuarioDTO
    {
        public int Id { get; set; }
        public string Nome { get; set; }
        public List<LivroDTO> LivrosEmprestados { get; set; }
    }
}