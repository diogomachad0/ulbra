public class Heroi : Personagem
    {

        public Heroi(string nome, int forca, int inteligencia, string poderes) : base(nome, forca, inteligencia, poderes)
        { }

        public override void Lutar()
    {
        Console.WriteLine("Lutando como um herói");
        
    }
}
