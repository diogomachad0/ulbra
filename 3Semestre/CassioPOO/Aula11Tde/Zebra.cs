namespace Aula11Tde
{
    class Zebra : IImpressoraDeCodigoDeBarras
    {
        private readonly int resolucao = 600;
        private readonly double larguraEtiqueta = 15;
        private readonly double alturaEtiqueta = 7;
        private readonly string tipoEtiqueta = "Poliéster";

        public void ImprimirEtiqueta(Produto produto)
        {
            Console.WriteLine($"Imprimindo etiqueta na impressora Zebra: {produto.CodBarras}");
            // Lógica para impressão colorida com resolução de 600dpi e tamanho padrão de 15cm x 7cm
            Console.WriteLine("Impressão realizada com sucesso!");
        }
    }
}