package Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;
public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha uma ação:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Exibir todas as tarefas");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a data da tarefa: ");
                    String data = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();

                    Tarefa novaTarefa = new Tarefa(titulo, data, descricao);
                    listaDeTarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
            }
                switch (escolha) {
                    case 1:
                        System.out.print("Digite o título da tarefa: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Digite a data da tarefa: ");
                        String data = scanner.nextLine();
                        System.out.print("Digite a descrição da tarefa: ");
                        String descricao = scanner.nextLine();

                        Tarefa RemoverTarefa = new Tarefa(titulo, data, descricao);
                        listaDeTarefas.remove(RemoverTarefa);
                        System.out.println("Tarefa removida com sucesso!");
                        break;
            }
        }
    }
}

