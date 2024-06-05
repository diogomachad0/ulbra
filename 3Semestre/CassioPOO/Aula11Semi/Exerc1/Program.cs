using Exerc1;

public class Program
{
    public static void Main(string[] args)
    {
        IPagamento cartaoCredito = new CartaoCredito();
        IPagamento boleto = new Boleto();

        Cliente cliente1 = new Cliente(cartaoCredito);
        Cliente cliente2 = new Cliente(boleto);

        double valorCompra1 = 100.0;
        double valorCompra2 = 200.0;

        cliente1.Comprar(valorCompra1);
        cliente2.Comprar(valorCompra2);
    }
}