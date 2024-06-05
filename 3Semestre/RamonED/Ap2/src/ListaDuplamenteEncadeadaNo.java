public class ListaDuplamenteEncadeadaNo {
    public No cabeca;
    public No cauda;

    public ListaDuplamenteEncadeadaNo() {
        cabeca = null;
        cauda = null;
    }

    public void inserirNoInicio(int valor) {
        No novoNo = new No(valor);
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        }
    }

    public void inserirApos(int valor, int valorAnterior) {
        No novoNo = new No(valor);
        No noAtual = cabeca;
        while (noAtual != null && noAtual.valor != valorAnterior) {
            noAtual = noAtual.proximo;
        }
        if (noAtual != null) {
            novoNo.proximo = noAtual.proximo;
            novoNo.anterior = noAtual;
            if (noAtual.proximo != null) {
                noAtual.proximo.anterior = novoNo;
            }
            noAtual.proximo = novoNo;
            if (noAtual == cauda) {
                cauda = novoNo;
            }
        } else {
            System.out.println(valorAnterior + " não encontrado na lista.");
        }
    }

    public void inserirNoFim(int valor) {
        No novoNo = new No(valor);
        if (cauda == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.anterior = cauda;
            cauda.proximo = novoNo;
            cauda = novoNo;
        }
    }

    public void ordenarCrescenteA() {
        boolean trocado;
        No noAtual;
        if (cabeca == null) {
            return;
        }
        do {
            trocado = false;
            noAtual = cabeca;
            while (noAtual.proximo != null) {
                if (noAtual.valor > noAtual.proximo.valor) {
                    trocarNos(noAtual, noAtual.proximo);
                    trocado = true;
                }
                noAtual = noAtual.proximo;
            }
        } while (trocado);
    }

    public void ordenarDecrescenteB() {
        boolean trocado;
        No noAtual;
        if (cabeca == null) {
            return;
        }
        do {
            trocado = false;
            noAtual = cabeca;
            while (noAtual.proximo != null) {
                if (noAtual.valor < noAtual.proximo.valor) {
                    trocarNos(noAtual, noAtual.proximo);
                    trocado = true;
                }
                noAtual = noAtual.proximo;
            }
        } while (trocado);
    }

    private void trocarNos(No no1, No no2) {
        int temp = no1.valor;
        no1.valor = no2.valor;
        no2.valor = temp;
    }

    public void imprimirLista() {
        No noAtual = cabeca;
        while (noAtual != null) {
            System.out.print(noAtual.valor + " ");
            noAtual = noAtual.proximo;
        }
        System.out.println();
    }
}