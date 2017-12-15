package com.thoughtworks;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Forca forca = new Forca("DANIELA", 7);

        while (forca.getTentativas() > 0) {
            System.out.println(" Dê seu palpite: ");

            Scanner scan = new Scanner(System.in);
            String palpite = scan.nextLine().trim();

            if (palpite.equalsIgnoreCase(forca.getPalavra())) {
                System.out.println("Acertou! ");
                break;
            } else {
                System.out.println("Errou! ");
            }

            forca.setTentativas(forca.getTentativas() - 1);
            System.out.println("Vc tem " + forca.getTentativas() + "tentativas");
        }

    }

}
