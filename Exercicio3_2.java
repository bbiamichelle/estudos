public class Exercicio3_2 {
    public static void main(String[] args) {
        int resultado = 0;
        int ultimovalor;
        for (int i = 0; i <= 1000; i ++){
            ultimovalor = resultado;
            resultado += i;
            System.out.printf("%d = %d + %d\n", resultado, ultimovalor, i);
        }
    }
}
