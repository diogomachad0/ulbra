namespace Exerc1
{
    public class CartaoCredito : IPagamento
    {
        public void Pagar(double valor)
        {
            Console.WriteLine($"Pagamento realizado com cartão de crédito no valor de R${valor}");
        }
    }

}