import java.util.Scanner;

public class DefinirPrioridade {
    public static void main(String[] args) {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Gestante");
        System.out.println("2. Idosa");
        System.out.println("3. Pessoa com Deficiência (PCD)");
        System.out.println("4. Nenhuma das alternativas");

        int opcao = scanner.nextInt();
        if (opcao == 1 || opcao == 2 || opcao == 3) {
            System.out.println("Você tem direito a fila prioritária.");
        } else if (opcao == 4) {
            System.out.println("Você não tem direito a fila prioritária.");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}