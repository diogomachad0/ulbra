public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int resultado1 = c.somar(2, 3);
        System.out.println(resultado1);
        int resultado2 = c.subtrair(2, 1);
        System.out.println(resultado2);
        int resultado3 = c.multiplicar(10, 5);
        System.out.println(resultado3);
        double resultado4 = c.dividir(10, 2);
        System.out.println(resultado4);

    }
}