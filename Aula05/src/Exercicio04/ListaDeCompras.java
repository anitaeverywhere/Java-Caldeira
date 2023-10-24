package Exercicio04;
import Exercicio03.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        ArrayList<Compras> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha uma ação:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Exibir lista de compras");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do produto ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a data de validade: ");
                    String dataDeValidade = scanner.nextLine();
                    System.out.print("Digite a descrição do produto: ");
                    String descricao = scanner.nextLine();

                    Compras novaCompra= new Compras( nome,dataDeValidade,descricao);
                    listaDeCompras.add(novaCompra);
                    System.out.println("Produto adicionado com sucesso");
                    break;
            }
            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do produto ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a data de validade: ");
                    String dataDeValidade = scanner.nextLine();
                    System.out.print("Digite a descrição do produto: ");
                    String descricao = scanner.nextLine();

                    Compras novaCompra= new Compras( nome,dataDeValidade,descricao);
                    listaDeCompras.remove(novaCompra);
                    System.out.println("Produto removido com sucesso");
                    break;
            }
}
}
}