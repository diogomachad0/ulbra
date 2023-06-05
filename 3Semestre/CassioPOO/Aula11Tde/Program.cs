using Aula11Tde;

public class Main
{
    class Program
    {
        static void Main(string[] args)
        {
            List<IImpressoraDeCodigoDeBarras> impressoras = new List<IImpressoraDeCodigoDeBarras>();
            impressoras.Add(new Elgin());
            impressoras.Add(new Zebra());

            Console.WriteLine("Informe o código de barras a ser impresso:");
            string codBarras = Console.ReadLine();

            Produto produto = new Produto
            {
                Id = "1",
                CodBarras = codBarras,
                Preco = 19.99
            };

            foreach (var impressora in impressoras)
            {
                impressora.ImprimirEtiqueta(produto);
            }
        }
    }
}