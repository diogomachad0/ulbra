namespace Exerc1
{
public class Cliente
{
    private IPagamento formaPagamento;

    public Cliente(IPagamento formaPagamento)
    {
        this.formaPagamento = formaPagamento;
    }

    public void Comprar(double valorCompra)
    {
        formaPagamento.Pagar(valorCompra);
    }
}

}