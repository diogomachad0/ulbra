public class Turma {
    private Aluno[] alunos;

    public Turma(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public double calcularMedia() {
        double somaMedia = 0;
        for (Aluno aluno : alunos) {
            somaMedia = somaMedia + aluno.calcularMedia();
        }
        return somaMedia / alunos.length;
    }
}
