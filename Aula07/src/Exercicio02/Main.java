package Exercicio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String diaHoje;
        boolean entradaValida = false;
            System.out.println("Que dia é hoje?");
            diaHoje = scanner.nextLine();
            DiaDaSemana diaEscolhido = DiaDaSemana.valueOf(diaHoje);


            switch (diaEscolhido) {
                case DOMINGO:
                System.out.println("Dia de descanso!");
                break;
            case SEGUNDA:
            case TERCA:
            case QUARTA:
            case QUINTA:
                System.out.println("Dia de trabalho.");
                break;
            case SEXTA:
                System.out.println("Sextou!");
                break;
            case SABADO:
                System.out.println("Dia de relaxar.");
                break;
            default:
                System.out.println("Dia inválido.");
        }

        scanner.close();


        }
    }

