public class Main {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("scheila",1010,"TI");
        Estudante estudante2 = new Estudante("diogo",1011);

        System.out.println(estudante1.getNome() + " " + estudante1.getMatricula() + " " + estudante1.getCurso());
        System.out.println(estudante2.getNome() + " " + estudante2.getMatricula() + " " + estudante2.getCurso());
    }
}