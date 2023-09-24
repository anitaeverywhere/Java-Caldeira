import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 Número");
        double Numero1 = scanner.nextDouble();
        System.out.println("Digite outro número");
        double Numero2 = scanner.nextDouble();
        System.out.println("1. Multiplicar");
        System.out.println("2. Dividir");
        System.out.println("3. Somar");
        System.out.println("4. Subtrair");
        System.out.println("5. Sair");
        int opcao = scanner.nextInt();
        if (opcao == 1) ;
        {
            System.out.println("o resultado é" + Numero1 * Numero2);
        }
        if (opcao == 2) {
            System.out.println("O resultado é" + Numero1 / Numero2);
        }
        if (opcao == 3) {
            System.out.println("O resultado é" + Numero1 + Numero2);
        }
        if (opcao == 4) {
            System.out.println("O resultado é" + (Numero1 - Numero2));
        }
        if (opcao == 5) {
            System.out.println("Deseja Sair?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
        }

    }
}

