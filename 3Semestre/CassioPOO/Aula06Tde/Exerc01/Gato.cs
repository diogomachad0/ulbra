namespace Aula06
{
    public class Gato : Animal
    {
        public override void Falar()
        {
            Console.WriteLine("Miau!: " + Nome);
        }
    }
}