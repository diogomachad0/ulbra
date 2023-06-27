package Atividade02;

public class Dinheiro extends Pagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado em dinheiro");
    }

    public void emitirRecibo() {
        System.out.println("Recibo do pagamento em dinheiro");
    }
}
