namespace Aula06
{
    public class Progam
    {
        static void Main(string[] args)
        {
            Cachorro cachorro = new Cachorro();
            cachorro.Nome = "Pipa";
            cachorro.Falar();

            Gato gato = new Gato();
            gato.Nome = "Kiko";
            gato.Falar();
        }
    }
}