package Atividade3;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica figura = new FiguraGeometrica();
        System.out.println("Area da figura: " + figura.calcularArea());
        System.out.println("Perimetro da figura: " + figura.calcularPerimetro());

        System.out.println(" ");

        Quadrado quadrado = new Quadrado(4);
        System.out.println("Area do quadrado: " + quadrado.calcularArea());
        System.out.println("Perimetro do quadrado: " + quadrado.calcularPerimetro());
    }
}
