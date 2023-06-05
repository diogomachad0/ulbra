namespace Exerc1
{
public class Boleto : IPagamento
{
    public void Pagar(double valor)
    {
        Console.WriteLine($"Pagamento realizado com boleto bancário no valor de R${valor}");
    }  
}
}