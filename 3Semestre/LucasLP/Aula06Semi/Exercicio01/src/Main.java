public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.raio = 10;
        double resultado = c.calcularArea();
        System.out.println(resultado);

        Circulo cc = new Circulo();
        c.raio = 10;
        double resultado2 = c.calcularPerimetro();
        System.out.println(resultado2);
    }
}