using aula20AS.Domain.Entities;
using aula20AS.Domain.Interfaces;
using aula20AS.Domain.Interfaces.ServiceInterfaces;

namespace aula20AS.Services
{
    public class AutorService : IAutorService
    {
        private readonly IAutorRepository _autorRepository;

        public AutorService(IAutorRepository autorRepository)
        {
            _autorRepository = autorRepository;
        }

        public List<Autor> GetAllAutores()
        {
            return _autorRepository.GetAll();
        }

        public Autor GetAutorById(int id)
        {
            return _autorRepository.GetById(id);
        }

        public void CreateAutor(Autor autor)
        {
            _autorRepository.Create(autor);
        }

        public void UpdateAutor(Autor autor)
        {
            _autorRepository.Update(autor);
        }

        public void DeleteAutor(int id)
        {
            _autorRepository.Delete(id);
        }
    }
}