package Atividade9;

public class Cliente extends Pessoa{
    int numeroCartao;

    public Cliente(String nome, String endereco, int numeroCartao){
        super(nome, endereco);
        this.numeroCartao = numeroCartao;
    }
}
