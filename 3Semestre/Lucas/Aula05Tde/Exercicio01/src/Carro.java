public class Carro {

    public String marca;
    public String modelo;
    public int ano;
    public String cor;

    public void caracteristicaCarro(Carro c){
        System.out.println(c.marca + "\n" + c.modelo + "\n" + c.cor + "\n" + c.ano);
    }

    public void acelerarCarro(){
        System.out.println("Acelerando carro!");
    }

    public void frear(){
        System.out.println("Freando o carro.");
    }

}
