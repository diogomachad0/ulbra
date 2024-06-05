public class SuperHeroi : Personagem
{

    public SuperHeroi(string nome, int forca, int inteligencia, string poderes) : base (nome, forca, inteligencia, poderes)
    { }

    public void SuperPoder()
    {
        Console.WriteLine("Usando o super poder como um super herói");
        
    }

}
