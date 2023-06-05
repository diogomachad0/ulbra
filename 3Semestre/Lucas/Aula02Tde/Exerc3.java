public class Exerc3 {

    public static void main(String[] args) {

        int j = 1;

        for(int i = 0, cont = 0; cont<15; cont++){
            System.out.println(i + "");
            i = i + j;
            j = i - j;
        }
    }
}

