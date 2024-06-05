public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.base = 15;
        r.altura = 10;
        double resultado1 = r.calcularArea();
        System.out.println(r.calcularArea());

        Retangulo rr = new Retangulo();
        r.base = 15;
        r.altura = 10;
        double resultado2 = r.calcularPerimetro();
        System.out.println(r.calcularPerimetro());

    }
}