package Exercicio06;
import java.util.LinkedList;
import java.util.Scanner;

public class ReservaDePassagens {
    public static void main(String[] args) {
        LinkedList<Reserva> ReservaDePassagens = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opções:");
        System.out.println("1. Reservar passagem");
        System.out.println("2. cancelar reserva");
        System.out.println("3. Exibir lista de reservas");
        int opcoes = scanner.nextInt();
        switch (opcoes){
            case 1:
                System.out.println("Digite seu cpf");
                 int cpf = scanner.nextInt();
                System.out.println("Digite seu nome");
                int nome = scanner.nextInt();
                System.out.println("Digite a cidade origem");
                int origem = scanner.nextInt();
                System.out.println("Digite o destino");
                int destino = scanner.nextInt();
                System.out.println("Digite a data de entrada");
                int entrada = scanner.nextInt();
                System.out.println("Digite a data de saída");
                int saida = scanner.nextInt();
              Reserva Passagem = new Reserva (nome, origem, cpf, saida, entrada, destino);
              ReservaDePassagens.add(Passagem);
                System.out.println("Viagem reservada!");
                break;

            case 2:
                System.out.println("Deseja remover a reserva?");
                System.out.println("Sim");
                System.out.println("Não");
                if (true) {
                    ReservaDePassagens.remove();
                }
                else {
                    break;
                }
            case 3:
                System.out.println("A sua lista de reservas é");
                for (Reserva passagem : ReservaDePassagens){
                    System.out.println(passagem);
                }



        }


    }
}
