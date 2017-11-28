public class IfElse {

    public static void main ( String []args){

        int idade = 19;
        if(idade < 18) {
            System.out.println("Não pode entrar");

        } else {
            System.out.println("Pode entrar");
        }

        verificarIdade(args);
        testandowhile(args);
        testandoWhile2(args);
        testandoFor(args);
        testandoWhile3(args);
        testandoLoops(args);
        testandoBreak(args);
    }

    public static void verificarIdade (String []args){

        int idade = 15;
        boolean amigoDoDono = true;
        if (idade < 18 && amigoDoDono == false) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }
    }

    public static void testandowhile (String [] args){

        int idade = 15;
        while (idade <18){

            System.out.println(idade);
            idade = idade +1;
        }

    }

    public static void testandoWhile2 (String []args){

        int i = 0;
        while ( i < 10){
            System.out.println(i);
            i = i +1;
        }
    }

    public static void testandoFor (String []args){

        for (int i = 0; i < 10; i = i + 1){
            System.out.println("Olá");
        }
    }

    public static void testandoWhile3 (String [] args){

        int i = 0;
        while (i < 10){
            System.out.println("Olá de novo");
            i = i + 1;
        }

    }

    public static void testandoLoops (String [] args){

        for (int i = 0; i < 100; i++){
            if (i > 50 && i< 60){
                continue;
            }

            System.out.println(i);
        }
    }

    public static void testandoBreak (String [] args){

        int x = 0;
        int y = 100;
        int i;
        for (i = x; i < y; i++){
            if (i/19 == 0){
                System.out.println("Achei um número divisivél por 19 entre y e y");
                break;
            }
        }
        
        System.out.println("esse número é " + i);

    }
}
