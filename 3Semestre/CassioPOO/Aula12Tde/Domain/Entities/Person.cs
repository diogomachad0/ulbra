

namespace Aula12Tde.Domain.Entities
{
    public class Person
    {
        public int Id { get; set; }
        public string Nome { get; set; }
        public DateTime Idade { get; set; }
        public string PhoneNumber { get; set; }
        public City City { get; set; }
    }
}