namespace Aula10
{
    public class Cachorro :IAnimal
    {
        public void emitirSom()
        {
            Console.WriteLine("Au au");
        }

        public void EmitirSom()
        {
            throw new NotImplementedException();
        }
    }
}