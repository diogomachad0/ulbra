public class Main {
    public static void main(String[] args) {
        // instancias animais
        Animal animal1 = new Animal("Leão", 5, 150.0, "Felino");
        Mamifero mamifero1 = new Mamifero("Gato", 2, 5.0, "Felino", "Pelagem curta");
        Ave ave1 = new Ave("Papagaio", 10, 0.5, "Aves", 0.6);

        // instancias funcionarios
        Funcionario funcionario1 = new Funcionario("João", "Atendente", 2000.0);
        Veterinario veterinario1 = new Veterinario("Maria", "Veterinário", 5000.0, "Animais selvagens");

        animal1.movimentar();

        mamifero1.movimentar("Pulando");
        mamifero1.amamentar();

        ave1.movimentar("Batendo asas");
        ave1.voar();
        ave1.realizarTruque();

        veterinario1.realizarExame(animal1);

        // instancia zoologico
        Zoo zoo = new Zoo(10, 5);

        zoo.adicionarAnimal(animal1);
        zoo.adicionarAnimal(mamifero1);
        zoo.adicionarAnimal(ave1);

        zoo.adicionarFuncionario(funcionario1);
        zoo.adicionarFuncionario(veterinario1);
    }
}
