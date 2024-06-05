namespace Aula08Ap1
{
     class Vaga
    {
        public int Numero { get; set; }
        public bool Ocupada { get; set; }

        public Vaga(int numero)
        {
            Numero = numero;
            Ocupada = false;
        }
    }
    
}