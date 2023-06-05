package Atividade2;

public class Carro extends Veiculo{
    int numPassageiros;

    public Carro(String marca, String modelo, int numPassageiros){
        super(marca, modelo);
        this.numPassageiros = numPassageiros;
    }
}
