namespace Aula06{

    class Progam
    {

        static void Main(string[] args)
        {
            Moto moto = new Moto();
            moto.Modelo = "Honda";
            moto.Acelerar();

            Carro carro = new Carro();
            carro.Modelo = "VW";
            carro.Acelerar();

            
        }

    }

}