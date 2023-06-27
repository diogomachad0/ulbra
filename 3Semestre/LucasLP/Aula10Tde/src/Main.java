public class Main {
    public static void main(String[] args) {
        Equipe equipe1 = new Equipe("1");
        Equipe equipe2 = new Equipe("2");

        equipe1.registrarVitoria();
        equipe1.registrarEmpate();
        equipe1.registrarDerrota();
        equipe2.registrarVitoria();
        equipe2.registrarEmpate();
        equipe2.registrarDerrota();

        equipe1.exibirInformacoes();
        equipe2.exibirInformacoes();



    }
}