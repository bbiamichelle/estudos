public class Exercicio3_7 {

    public static void main(String[] args) {

        int y;
        int x = 13;

        while (x != 1) {

            if (x % 2 == 0) {

                y = x / 2;
                System.out.println(" " + y);
                x = y;
            } else {

                y = 3 * x + 1;
                System.out.println(" " + y);
                x = y;

            }
        }
    }
}



