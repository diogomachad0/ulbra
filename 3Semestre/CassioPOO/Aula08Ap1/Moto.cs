namespace Aula08Ap1
{
    public class Moto : Veiculo
    {
        public int Cilindrada { get; set; }

        public Moto()
        {
        }
        
        public override void ImprimirDados()
        {
            Console.WriteLine($"{GetType().Name} - Marca: {Marca}, Modelo: {Modelo}, Placa: {Placa}, Cilindrada: {Cilindrada}");
        }
    }
}