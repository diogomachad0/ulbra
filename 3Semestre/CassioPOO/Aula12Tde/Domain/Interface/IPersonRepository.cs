using Aula12Tde.Domain.Entities;
using Aula12Tde.Domain.Interface;
namespace Aula12Tde.Domain.Interface
{
    public class IPersonRepository
    {
        public interface IPersonRepository : IBaseRepository<Person>
        {

        }
    }
}