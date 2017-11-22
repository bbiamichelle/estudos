import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {
        inteiro();
        System.out.println("Meu cabelo está engraçado \n ele está parecendo a coroa de um abacaxi");

        for (String arg: args) {
            System.out.println(arg);
        }
    }

    public static void inteiro (){
        int idade;
        int idadeNoAnoQueVem;
        idade = 15;
        idadeNoAnoQueVem = idade +1;
        System.out.println( "Minha idade " + idade );
        System.out.println(String.format("Minha idade é %d, %s, %s", idade, "jaca", '1'));
        System.out.println( "Minha idade no ano que vem "+ idadeNoAnoQueVem);

    }
}