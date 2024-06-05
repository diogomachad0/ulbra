using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Aula12Tde.Data.Context;
using Aula12Tde.Domain.Entities;
using Aula12Tde.Domain.Interface;


namespace Aula12Tde.Data.Repositories
{
    public class CityRepository : ICityRepository
    {
        private readonly MeuContexto context;

        public CityRepository(MeuContexto context)
        {
            this.context = context;
        }

        public void Delete(int entityId)
        {
            var c = GetById(entityId);
            context.Cities.Remove(c);
            context.SaveChanges();
        }

        public IList<City> GetAll()
        {
            return context.Cities.ToList();
        }

        public City GetById(int entityId)
        {
            return context.Cities.SingleOrDefault(x => x.Id == entityId);
        }

        public void Save(City entity)
        {
            context.Add(entity);
            context.SaveChanges();
        }

        public void Update(City entity)
        {
            context.Cities.Update(entity);
            context.SaveChanges();
        }
    }
}