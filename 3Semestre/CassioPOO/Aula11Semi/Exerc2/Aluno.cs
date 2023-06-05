namespace Exerc2
{
   public class Aluno : IPessoa
{
    public string Nome { get; set; }
    public int Idade { get; set; }

    public void Falar()
    {
        Console.WriteLine($"Aluno {Nome}, {Idade} anos, falando...");
    }
}
}