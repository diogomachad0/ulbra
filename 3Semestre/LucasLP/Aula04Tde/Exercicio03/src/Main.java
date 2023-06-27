public class Main {

    public static void main(String[] args) {

        Quadrado q = new Quadrado();
        q.lado = 4;
        double resultado = q.calcularArea();
        System.out.println("Quadrado: " + resultado);

        Circunferencia c = new Circunferencia();
        c.raio = 5;
        double resultado2 = c.calcularArea();
        System.out.println("Circunferencia: " + resultado2);

        Trapezio t = new Trapezio();
        t.baseMenor = 1;
        t.baseMaior = 3;
        t.altura = 10;
        double resultado3 = t.calcularArea();
        System.out.println("Trapezio: " + resultado3);

        Triangulo tt = new Triangulo();
        tt.base = 2;
        tt.altura = 4;
        double resultado4 = tt.calcularArea();
        System.out.println("Triangulo: " + resultado4);
        
    }

}