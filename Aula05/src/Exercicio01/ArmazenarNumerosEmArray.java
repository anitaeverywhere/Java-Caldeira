package Exercicio01;

import java.util.Scanner;

public class ArmazenarNumerosEmArray {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite 5 numeros");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número #" + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
            int soma = 0;
            for (int i1 = 0; i < 5; i++) {
                soma += numeros[i];
            }
            double media = (double) soma / 5;
            System.out.println("Soma dos números: " + soma);
            System.out.println("Média dos números: " + media);


        }
    }
}
