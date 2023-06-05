public class Vilao : Personagem
{

    public Vilao(string nome, int forca, int inteligencia, string poderes) : base(nome, forca, inteligencia, poderes)
    { }

    public override void Lutar(){
        Console.WriteLine("Lutando como um vilão");
        
    }

}
