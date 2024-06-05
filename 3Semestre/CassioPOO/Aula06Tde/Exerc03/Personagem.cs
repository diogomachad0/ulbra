public class Personagem
{

    public string Nome {get; set;}
    public int Forca {get; set;}
    public int Inteligencia {get; set;}
    public string Poderes {get; set;}

    public Personagem(string nome, int forca, int inteligencia, string poderes)
    {
        this.Nome = nome;
        this.Forca = forca;
        this.Inteligencia = inteligencia;
        this.Poderes = poderes;
    }

    public virtual void Lutar()
    {
        Console.WriteLine("Lutando como um personagem comum");
        
    }
}
