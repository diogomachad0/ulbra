using Aula08Ap1;

class Program
{
    static void Main(string[] args)
    {
        
        RepositorioEstacionamento repositorio = new RepositorioEstacionamento();

        while (true)
        {
             Console.WriteLine("-> Estacionamento <-");
            Console.WriteLine("Selecione uma opção:");
            Console.WriteLine("1 - Estacionar carro");
            Console.WriteLine("2 - Estacionar moto");
            Console.WriteLine("3 - Listar veículos estacionados");
            Console.WriteLine("4 - Excluir veiculo");
            Console.WriteLine("5 - Sair");

            int opcao = int.Parse(Console.ReadLine());

            switch (opcao)
            {
                case 1:
                    Console.WriteLine("Digite a marca do carro:");
                    string marcaCarro = Console.ReadLine();

                    Console.WriteLine("Digite o modelo do carro:");
                    string modeloCarro = Console.ReadLine();

                    Console.WriteLine("Digite a placa do carro:");
                    string placaCarro = Console.ReadLine();

                    Console.WriteLine("Digite o número de portas do carro:");
                    int numeroPortas = int.Parse(Console.ReadLine());

                    repositorio.EstacionarCarro(marcaCarro, modeloCarro, placaCarro, numeroPortas);
                    break;

                case 2:
                    Console.WriteLine("Digite a marca da moto:");
                    string marcaMoto = Console.ReadLine();

                    Console.WriteLine("Digite o modelo da moto:");
                    string modeloMoto = Console.ReadLine();

                    Console.WriteLine("Digite a placa da moto:");
                    string placaMoto = Console.ReadLine();

                    Console.WriteLine("Digite a quantidade de cilindradas da moto:");
                    int cilindrada = Convert.ToInt32(Console.ReadLine());

                    repositorio.EstacionarMoto(marcaMoto, modeloMoto, placaMoto, cilindrada);
                    break;

                case 3:
                    repositorio.ListarVeiculos();
                    break;

                case 4:
                    Console.Write("Digite a placa do veículo a ser excluído: ");
                    string placa = Console.ReadLine();
                    repositorio.ExcluirVeiculoPorPlaca(placa);
                    Console.WriteLine();

                    break;

                case 5:
                    Console.WriteLine("Saindo...");
                    return;
                default:
                    Console.WriteLine("Opção inválida");
                    break;
            }
        }
    }
}