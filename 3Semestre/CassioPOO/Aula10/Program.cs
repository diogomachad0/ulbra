using Aula10;

class Progam
{
    static void Main(string[] args)
    {
        IAnimal cachorro = new Cachorro();
        cachorro.emitirSom();

        IAnimal gato = new Gato();
        gato.emitirSom();

        IAnimal papagaio = new Papagaio();
        papagaio.emitirSom();
    }
}