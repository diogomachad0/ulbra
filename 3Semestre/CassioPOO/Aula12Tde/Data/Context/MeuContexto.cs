using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Aula12Tde.Domain.Entities;
using Microsoft.EntityFrameworkCore;

namespace Aula12Tde.Data
{
    public class MeuContexto : DbContext
    {
        protected string DbPath { get; }
        public MeuContexto()
        {
            string path = Directory.GetCurrentDirectory();
            DbPath = System.IO.Path.Join(path, "TestandoORM.db");
        }

        protected override void OnConfiguring(DbContextOptionsBuilder options)
            => options.UseSqlite($"Data Source={DbPath}");

        public DbSet<Person> Persons { get; set; }
        public DbSet<City> Cities { get; set;}
    }
}