import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O objetivo neste jogo de adivinhação é descobrir quantos soldados os 300 espartanos irão enfrentar.");
                System.out.println("Digite o seu palpite");
        double NumeroSoldados = scanner.nextInt();
        if (NumeroSoldados < 300000){
            System.out.println("Um pouco mais!");
        }
    }
}
