

namespace Aula12Tde.Domain.Entities
{
    public class City
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public List<Person> people {get; set;}
    }
}