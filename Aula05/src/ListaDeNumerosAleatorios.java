import java.util.Random;
import java.util.Scanner;
public class ListaDeNumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        Random rand = new Random();
        int soma = 0;
        for (int i = 0; i < 100; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }
        System.out.println("digite um número");
        int numeroDesejado = scan.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == numeroDesejado) {
                encontrado = true;
                break;

            }
        }
    }
}
