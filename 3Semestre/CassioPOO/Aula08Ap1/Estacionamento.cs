namespace Aula08Ap1
{
    public class Estacionamento
    {
        
        private List<Vaga> vagas;

        public Estacionamento(int quantidadeVagas)
        {
            vagas = new List<Vaga>();

            for (int i = 1; i <= quantidadeVagas; i++)
            {
                vagas.Add(new Vaga(i));
            }
        }

        public bool PermitirEntrada(Veiculo veiculo)
        {
            if (veiculo is Carro)
            {
                foreach (Vaga vaga in vagas)
                {
                    if (!vaga.Ocupada)
                    {
                        vaga.Ocupada = true;
                        return true;
                    }
                }
            }
            else if (veiculo is Moto)
            {
                foreach (Vaga vaga in vagas)
                {
                    if (!vaga.Ocupada)
                    {
                        vaga.Ocupada = true;
                        return true;
                    }
                }
            }

            return false;
        }
    }
}