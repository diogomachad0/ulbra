public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.ano = 2011;
        c.cor = "Branco";
        c.modelo = "Golf";
        c.marca = "VW";
        c.caracteristicaCarro(c);
        c.acelerarCarro();
        c.frear();

    }
}