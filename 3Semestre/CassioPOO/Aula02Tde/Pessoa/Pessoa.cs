public class Pessoa
{
    public string nome { get; set; }
    public int idade { get; set; }


public void apresentar(string nome, int idade)
{
    Console.WriteLine("Meu nome é " + nome + " e eu tenho " + idade + " anos.");
}
}
