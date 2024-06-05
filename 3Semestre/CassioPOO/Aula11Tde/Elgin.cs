namespace Aula11Tde
{
    class Elgin : IImpressoraDeCodigoDeBarras
    {
        private readonly int resolucao = 300;
        private readonly double larguraEtiqueta = 10;
        private readonly double alturaEtiqueta = 5;
        private readonly string tipoEtiqueta = "Papel adesivo";

        public void ImprimirEtiqueta(Produto produto)
        {
            Console.WriteLine($"Imprimindo etiqueta na impressora Elgin: {produto.CodBarras}");
            // Lógica para impressão em preto e branco com resolução de 300dpi e tamanho padrão de 10cm x 5cm
            Console.WriteLine("Impressão realizada com sucesso!");
        }
    }
}
