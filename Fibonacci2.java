public class Fibonacci2 {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        while ( b <= 500){

            a = a + b;

            System.out.println("Serie Fibonacci " + b);

            b = a - b;
        }
    }
}

