public class Main {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroDaConta = 5598;
        conta1.saldo = 150;
        conta1.titular = "Diogo Machado";
        System.out.println("Saldo da conta " + conta1.numeroDaConta + " antes do depósito: R$" + conta1.saldo);
        conta1.depositar(150);
        System.out.println("Saldo da conta " + conta1.numeroDaConta + " após o depósito: R$" + conta1.saldo);
        System.out.println("Saldo da conta " + conta1.numeroDaConta + " antes da transferência: R$" + conta1.saldo);
        System.out.println("Saldo da conta " + conta1.numeroDaConta + " após a transferência: R$" + conta1.saldo);




    }

}