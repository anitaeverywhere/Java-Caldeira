import  java.util.Scanner;
public class LerDoisNumeros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("informe um numero");
        double numero1 = Scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = Scanner.nextDouble();
        System.out.println("Você digitou" + numero1 + numero2);
        Scanner.close();
    }

}