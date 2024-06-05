package Atividade01;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        System.out.println(" ");

        Retangulo retangulo = new Retangulo(2, 4);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        System.out.println(" ");

        Triangulo triangulo = new Triangulo(6, 4, 5);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
    }
}