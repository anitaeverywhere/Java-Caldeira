import java.util.Scanner;

public class LerTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Digite 3 números diferentes")

        if (quantidadeNumeros <= 0) {
            System.out.println("A quantidade de números deve ser maior que zero.");
            return;

            double maior = Double.MIN_VALUE;
            double menor = Double.MAX_VALUE;
            for (int i = 1; i <= quantidadeNumeros; i++) {
                System.out.print("Digite o número #" + i + ": ");
                double numero = scanner.nextDouble();
                soma += numero;

                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }

            double media = soma / quantidadeNumeros;

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("Média aritmética: " + media);

            scanner.close();
        }
    }
}
