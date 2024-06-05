namespace Aula08Ap1
{
    public abstract class Veiculo
    {
        public string Marca { get; set; }
        public string Modelo { get; set; }
        public string Placa { get; set; }

        public virtual void ImprimirDados()
        {
            Console.WriteLine($"{GetType().Name} - Marca: {Marca}, Modelo: {Modelo}, Placa: {Placa}");
        }
    }
}
