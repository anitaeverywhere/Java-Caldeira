import java.util.Scanner;
public class converterDolarParaEuroEReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor em dólar");
        int valorEmDolar = Scanner(System.in);
        System.out.println("Digite a taxa de câmbio");
        int valorDoCambio = Scanner(System.in);
        int conversaoDolar = valorEmDolar * valorDoCambio
        System.out.println("O valor total é" + conversaoDolar);

        scanner.close();
    }
}