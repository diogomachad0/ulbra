package Atividade02;

public class CartaoDebito extends Pagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de débito");
    }

    public void emitirRecibo() {
        System.out.println("Recibo do pagamento com cartão de débito");
    }
}