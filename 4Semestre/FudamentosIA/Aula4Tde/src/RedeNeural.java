public class RedeNeural {

    private final double[] pesosSinapticos;

    public RedeNeural() { // construtor que inicializa os pesos
        pesosSinapticos = new double[]{-1, -1};
    }


    public double funcaoAtivacao(double valor) {
        if (valor > 0) return 1;
        return 0;
    }

    public double processamento(double[] entradas) { // recebe o array com os valores de entrada e faz o calculo das entradas e depois aplica a funcaoAtivacao na saida da rede
        double somaPonderada = 0;
        for (int i = 0; i < pesosSinapticos.length; i++) {
            somaPonderada += pesosSinapticos[i] * entradas[i];
        }
        return funcaoAtivacao(somaPonderada);
    }

    public void treinar(double[][] conjuntoEntradas, double[] saidasDesejadas) { // é aplicado a regra delta calculando a saida e os erros da saida do resultado
        for (int x = 0; x < 1000; x++) {
            for (int i = 0; i < conjuntoEntradas.length; i++) {
                double saidaCalculada = processamento(conjuntoEntradas[i]);
                double erro = saidasDesejadas[i] - saidaCalculada;
                for (int j = 0; j < pesosSinapticos.length; j++) {
                    double taxaAprendizado = 1;
                    pesosSinapticos[j] += taxaAprendizado * erro * conjuntoEntradas[i][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        double[][] entradas = {
                {1, 1}, {1, 0}, {0, 1}, {0, 0}
        };
        // definidp entrada e saidas desejadas para o treinamento
        double[] saidas = {
                1, 1, 0, 0
        };
        // instanciado a classe e fazendo o teste da rede treinada com as entradas e saidas
        RedeNeural redeNeural = new RedeNeural();
        redeNeural.treinar(entradas, saidas);

        for (double[] entrada : entradas) {
            System.out.println(redeNeural.processamento(entrada));
        }
    }
}
