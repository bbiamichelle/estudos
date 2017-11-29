public class Exercicio3_5 {

    public static void main(String[] args) {

        int fatorial = 1;

        for (int n =1; n <= 20; n++){

            fatorial = fatorial * n;

            System.out.println("Fatorial de " + n + "=" + fatorial);
        }

        Testando2(args);
        Testando3(args);
    }

    public static void Testando2 (String [] args) {

        int fatorial =1;

        for (int n =1; n<=30; n++){

            fatorial = fatorial * n;

            System.out.println("Fatorial de "+ n + "="+ fatorial);
        }


    }public static void Testando3 (String [] args){

        long fatorial =1; // Se usou o long pq permite uma váriavel mais, pois quando tava o int a partir de n 34, o resultado era zero por não caber o tamanho do valor.

        for (long n=1; n<=40; n++){

            fatorial = fatorial * n;
            System.out.println("Fatorial de "+ n+ "=" + fatorial);
        }
    }


}
