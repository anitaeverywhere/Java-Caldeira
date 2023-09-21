import java.util.Scanner;
public class LerNomeEImprimir {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("informe o seu nome");
        int nome = Scanner.nextLine();
        System.out.println("Seu nome é: " + nome);
        Scanner.close();
    }

}