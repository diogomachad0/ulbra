package Atividade02;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito();
        cartaoCredito.realizarPagamento(100.0);
        cartaoCredito.emitirRecibo();

        System.out.println(" ");

        CartaoDebito cartaoDebito = new CartaoDebito();
        cartaoDebito.realizarPagamento(50.0);
        cartaoDebito.emitirRecibo();

        System.out.println(" ");

        Dinheiro dinheiro = new Dinheiro();
        dinheiro.realizarPagamento(75.0);
        dinheiro.emitirRecibo();
    }
}