namespace Aula08Ap1
{
    public class RepositorioEstacionamento
    {
        private List<Veiculo> veiculosEstacionados;

        public RepositorioEstacionamento()
        {
            veiculosEstacionados = new List<Veiculo>();
        }

        public void EstacionarCarro(string marca, string modelo, string placa, int numeroPortas)
        {
            Carro carro = new Carro { Marca = marca, Modelo = modelo, Placa = placa, NumeroPortas = numeroPortas };
            if (PermitirEntrada(carro))
            {
                veiculosEstacionados.Add(carro);
                Console.WriteLine($"O carro de placa {placa} entrou no estacionamento");
            }
            else
            {
                Console.WriteLine($"O carro de placa {placa} não pode entrar no estacionamento");
            }
        }

        public void EstacionarMoto(string marca, string modelo, string placa, int cilindrada)
        {
            Moto moto = new Moto { Marca = marca, Modelo = modelo, Placa = placa, Cilindrada = cilindrada };
            if (PermitirEntrada(moto))
            {
                veiculosEstacionados.Add(moto);
                Console.WriteLine($"A moto de placa {placa} entrou no estacionamento");
            }
            else
            {
                Console.WriteLine($"A moto de placa {placa} não pode entrar no estacionamento");
            }
        }

        private bool PermitirEntrada(Veiculo veiculo)
        {
            Estacionamento estacionamento = new Estacionamento(10);
            return estacionamento.PermitirEntrada(veiculo);
        }

        public void ListarVeiculos()
        {
            Console.WriteLine("Veículos estacionados:");
            foreach (Veiculo veiculo in veiculosEstacionados)
            {
                veiculo.ImprimirDados();
            }
        }

        public void ExcluirVeiculoPorPlaca(string placa)
        {
            Veiculo veiculoEncontrado = null;
            foreach (var veiculo in veiculosEstacionados)
            {
                if (veiculo.Placa == placa)
                {
                    veiculoEncontrado = veiculo;
                    break;
                }
            }
            if (veiculoEncontrado != null)
            {
                veiculosEstacionados.Remove(veiculoEncontrado);
                Console.WriteLine($"Veículo com a placa {placa} removido com sucesso!");
            }
            else
            {
                Console.WriteLine($"Veículo com a placa {placa} não encontrado.");
            }
        }
    }
}