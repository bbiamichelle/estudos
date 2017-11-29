public class Exercicio3_8 {

    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {

            for (int i = x; i <= x * x; i = i + x) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

}

