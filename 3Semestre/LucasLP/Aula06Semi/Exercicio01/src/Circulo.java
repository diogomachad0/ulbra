public class Circulo {

    double raio;
    public double calcularArea(){
        double area;
        double pi = 3.14;
        area = pi*(raio*raio);
        return area;
    }

    public double calcularPerimetro(){
        double perimetro;
        double pi = 3.14;
        perimetro = 2*pi*raio;
        return perimetro;
    }

}
