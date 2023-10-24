package Exercicio05;
import java.util.LinkedList;
import java.util.Scanner;
public class FilaDeImpressão {
    public static void main(String[] args) {
        LinkedList<String> Fila = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        String informacao = scanner.nextLine();
        Fila.add(informacao);
        System.out.println("Documentos para impressão");
        for (String documento : Fila) {
            System.out.println(documento);
        }

    }
}