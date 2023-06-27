package Atividade1;

public class Funcionario extends Pessoa{
    String cargo;

    public Funcionario(String nome, int idade, String cargo){
        super(nome, idade);
        this.cargo = cargo;
    }
}
