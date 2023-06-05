package Atividade02;

public class CartaoCredito extends Pagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito");
    }

    public void emitirRecibo() {
        System.out.println("Recibo do pagamento com cartão de crédito");
    }
}
