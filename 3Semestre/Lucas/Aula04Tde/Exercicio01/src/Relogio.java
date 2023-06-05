
    public class Relogio {
        private Ponteiro ponteiroHora;
        private Ponteiro ponteiroMinuto;
        private Ponteiro ponteiroSegundo;

        public Relogio() {
            this.ponteiroHora = new Ponteiro();
            this.ponteiroMinuto = new Ponteiro();
            this.ponteiroSegundo = new Ponteiro();
        }

        public void acertarRelogio (int hora, int minuto, int segundo) {
            int posicaoHora = hora % 12;
            this.ponteiroHora.setPosicao(posicaoHora);

            int posicaoMinuto = minuto / 5;
            this.ponteiroMinuto.setPosicao(posicaoMinuto);

            int posicaoSegundo = segundo / 5;
            this.ponteiroSegundo.setPosicao(posicaoSegundo);
        }

        public int lerHora() {
            return this.ponteiroHora.getPosicao();
        }

        public int lerMinuto() {
            return this.ponteiroMinuto.getPosicao() * 5;
        }

        public int lerSegundo() {
            return this.ponteiroSegundo.getPosicao() * 5;
        }
    }