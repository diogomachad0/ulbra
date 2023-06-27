public class Exerc2_4 {

    public static void main(String[] args) {

        int contador = 0;

        for(int i=1; contador<10; i++){
            if(i% 9 == 0){
                System.out.println(i);
                contador++;
            }
        }
    }
}
