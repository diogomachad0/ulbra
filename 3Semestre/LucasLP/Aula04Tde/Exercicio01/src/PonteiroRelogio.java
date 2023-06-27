public class PonteiroRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.acertarRelogio (3, 25, 50);

        int hora = relogio.lerHora();
        int minuto = relogio.lerMinuto();
        int segundo = relogio.lerSegundo();

        System.out.println("Hora atual: " + hora);
        System.out.println("Minuto atual: " + minuto);
        System.out.println("Segundo atual: " + segundo);
    }
}
