public class SuperVilao : Personagem
{

    public SuperVilao(string nome, int forca, int inteligencia, string poderes) : base(nome, forca, inteligencia, poderes)
    { }

    public void SuperPoder()
    {
        Console.WriteLine("Usando super poderes como um super vilão");
        
    }

}