public class Exercicio3_6 {

    public static void main(String[] args) {

        int a=0;
        int b=1;

        while ( b <= 100){

            a = a + b;
            System.out.println(" Serie Fibonacci " + b);
            b = a - b ;
        }

        Marcelat(args);
    }

    public static void Marcelat (String [] args){

        int a = 0;
        int b = 0;
        int c =0;
        int d =1;
        int dn;

        while ( d <= 1000){

            dn = a + b + c + d;
            System.out.println(  " " + d);
            a = b;
            b = c;
            c= d;
            d = dn;
        }
    }
}


