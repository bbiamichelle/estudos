public class Exercicio3_14 {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        while ( b <= 100){
            System.out.println( a + " " + b + " ");
            a = a + b;
            b = a - b;

            System.out.println("");
        }

    }
}
