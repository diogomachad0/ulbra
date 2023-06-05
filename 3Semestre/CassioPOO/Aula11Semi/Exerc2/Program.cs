using Exerc2;
public class Program
{
    public static void Main(string[] args)
    {
        Professor professor = new Professor
        {
            Nome = "João",
            Idade = 35
        };

        Aluno aluno = new Aluno
        {
            Nome = "Maria",
            Idade = 18
        };

        Escola escola = new Escola();

        escola.ApresentarPessoa(professor);
        escola.ApresentarPessoa(aluno);
    }
}