package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String Nome = "Marcelo";
        int idade = 80;

        if ( idade <= 10){

            System.out.println("O USUARIO " + Nome + "deverá pagar R$30,00");
        } else {

            if ( idade > 10 && idade <=29){

                System.out.println("O USUARIO " + Nome + "deverá pagar R$60,00");

            } else {
                if (idade > 29 && idade <=45){

                    System.out.println( "O USUARIO " + Nome + "deverá pagar R$120,00");
                } else {

                    if (idade > 45 && idade <=59){

                        System.out.println("O USUARIO \" + Nome + \"deverá pagar R$150,00");
                    } else{

                        if (idade > 59 && idade <=65){

                            System.out.println("O USUARIO \" + Nome + \"deverá pagar R$250,00");
                        } else{

                            System.out.println("O USUARIO \" + Nome + \"deverá pagar R$400,00");
                        }
                    }
                }
            }
        }


    }
}
