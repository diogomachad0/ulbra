public class ContaBancaria {

    public int numeroDaConta;
    public double saldo;
    public String titular;

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroDaConta + ".");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + numeroDaConta + ".");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque na conta " + numeroDaConta + ".");
        }
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            contaDestino.saldo = saldo + valor;
            System.out.println("Transferência de R$" + valor + " realizada da conta " + numeroDaConta + " para a conta " + contaDestino.numeroDaConta + ".");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência na conta " + numeroDaConta + ".");
        }
    }
}