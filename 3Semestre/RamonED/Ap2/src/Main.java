public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeadaNo lista = new ListaDuplamenteEncadeadaNo();

        lista.inserirNoInicio(5);
        lista.inserirNoFim(10);
        lista.inserirApos(8, 5);
        lista.inserirApos(15, 10);

        System.out.print("Elementos da lista: ");
        lista.imprimirLista();

        System.out.println(" ");

        lista.ordenarCrescenteA();
        System.out.print("Elementos ordenados (crescente A): ");
        lista.imprimirLista();

        System.out.println(" ");

        lista.ordenarDecrescenteB();
        System.out.print("Elementos ordenados (decrescente B): ");
        lista.imprimirLista();
    }
}