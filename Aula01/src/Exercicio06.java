import java.util.Scanner;

public class LerIdadeParaVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Digite Sua Idade")

        if (idade == 16 && idade == 17 && idade <65) {
            System.out.println ("O voto é facultativo")
            return;}

        if  (idade > 16) {
            System.out.println ("Você ainda não pode votar")
        }

        if (idade == 18 && >= 65){
            System.out.println ("O voto é Obrigatório")
        }
        scanner.close();
    }
}