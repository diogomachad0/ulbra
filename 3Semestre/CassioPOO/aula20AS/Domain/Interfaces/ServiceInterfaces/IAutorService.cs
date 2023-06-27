using aula20AS.Domain.Entities;

namespace aula20AS.Domain.Interfaces.ServiceInterfaces
{
    public interface IAutorService
    {
        List<Autor> GetAllAutores();
        Autor GetAutorById(int id);
        void CreateAutor(Autor autor);
        void UpdateAutor(Autor autor);
        void DeleteAutor(int id);
    }
}