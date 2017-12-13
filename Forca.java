import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Forca {

    public static void main(String[] args) {

        System.out.println(" Você tem que advinhar a palavra que eu estou pensando");
        System.out.println(" Digite uma palavra: ");

        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine().trim();

        System.out.println(nome);

        if (nome .equals("Casa")){
            System.out.println("Acertou");

        } else {
            System.out.println("Ops, tente de novo!");
        }
    }
}
