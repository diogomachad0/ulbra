public class Aluno {
    public Prova prova1;
    public Prova prova2;

    public Aluno(Prova prova1, Prova prova2) {
        this.prova1 = prova1;
        this.prova2 = prova2;
    }

    public double calcularMedia() {
        double notaTotal = prova1.calcularNotaTotal() + prova2.calcularNotaTotal();
        return notaTotal / 2;
    }
}