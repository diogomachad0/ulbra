namespace Exerc2
{
    public class Professor : IPessoa
    {
        public string Nome { get; set; }
        public int Idade { get; set; }

        public void Falar()
        {
            Console.WriteLine($"Professor {Nome}, {Idade} anos, falando...");
        }
    }
}