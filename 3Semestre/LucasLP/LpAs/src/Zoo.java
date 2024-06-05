class Zoo {
    private Animal[] animais;
    private Funcionario[] funcionarios;
    private int numAnimais;
    private int numFuncionarios;

    public Zoo(int tamanhoAnimais, int tamanhoFuncionarios) {
        animais = new Animal[tamanhoAnimais];
        funcionarios = new Funcionario[tamanhoFuncionarios];
        numAnimais = 0;
        numFuncionarios = 0;
    }

    public void adicionarAnimal(Animal animal) {
        if (numAnimais < animais.length) {
            animais[numAnimais] = animal;
            numAnimais++;
            System.out.println("Animal adicionado com sucesso!");
        } else {
            System.out.println("O limite de animais foi atingido. Não é possível adicionar mais animais.");
        }
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (numFuncionarios < funcionarios.length) {
            funcionarios[numFuncionarios] = funcionario;
            numFuncionarios++;
            System.out.println("Funcionário adicionado com sucesso!");
        } else {
            System.out.println("O limite de funcionários foi atingido. Não é possível adicionar mais funcionários.");
        }
    }
}