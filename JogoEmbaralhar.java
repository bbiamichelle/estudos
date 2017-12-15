package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        System.out.println(" Adivinhe a palavra monstruosa que me deu dor de cabeça: ");

        List<String> listaDePalavras = new ArrayList<String>();

        listaDePalavras.add("ADIVINHAR");
        listaDePalavras.add("CORRER");
        listaDePalavras.add("BOLO");
        listaDePalavras.add("PASSARINHO");
        listaDePalavras.add("CAIXA");

        Collections.shuffle(listaDePalavras); /* Não esquecer que eu embaralho tanto as palavras, como o caracter só que em momentos diferentes.*/

        String palavra = listaDePalavras.get(0);

        List<String> palavraEmbaralhada = Arrays.asList(palavra.split("")); /* Aqui eu estou quebrando uma string em caracteres com virgula */

        Collections.shuffle(palavraEmbaralhada);

        System.out.println(" A palavra é " + String.join("", palavraEmbaralhada)); /* agora eu estou transformando os caracteres embaralhados em plavra novamente sem virgula */
        System.out.println(" Escreva a palavra: ");

        int tentativas = 6;

        while ( tentativas > 0){

            Scanner scan = new Scanner(System.in);
            String respostaUsuario = scan.nextLine().trim();

            if (respostaUsuario.equalsIgnoreCase(palavra)) {
                System.out.println("Acertou");
                break;

            } else {
                tentativas = tentativas-1;
                System.out.println("Ops, tente de novo! Você tem " + tentativas + " tentativas");
            }

        }

    }
}
