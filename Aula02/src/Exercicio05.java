import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase");
        CharSequence texto;
        int comprimento = texto.length();
        int metade = comprimento / 2;
        String primeiraMetade = "";
        String segundaMetade = "";

        for (int i = 0; i < metade; i++) {
            primeiraMetade += texto.charAt(i);
        }

        for (int i = metade; i < comprimento; i++) {
            segundaMetade += texto.charAt(i);
        }

        System.out.println("Primeira metade: " + primeiraMetade);
    }
}