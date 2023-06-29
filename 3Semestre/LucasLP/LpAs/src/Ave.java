class Ave extends Animal implements Treinavel {
    private double envergaduraAsa;

    public Ave(String nome, int idade, double peso, String especie, double envergaduraAsa) {
        super(nome, idade, peso, especie);
        this.envergaduraAsa = envergaduraAsa;
    }

    public void voar() {
        System.out.println(getNome() + " está voando.");
    }

    @Override
    public void realizarTruque() {
        System.out.println(getNome() + " realizou um truque voador.");
    }
}