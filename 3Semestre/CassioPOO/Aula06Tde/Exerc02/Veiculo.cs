public class Veiculo
{
    public string Modelo {get; set;}

    public virtual void Acelerar(){
        Console.WriteLine("Acelerando...");
    
    }
}
