import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scan.nextInt();
        if(numero <= 1){
            System.out.println("Nenhum número primo encontrado");
        }else if(numero == 2){
            System.out.println(2);
        }else{
            for(int i = numero; i > 1; i--){
                for(int j = i - 1; j > 0; j--){
                    if(j == 1){
                        System.out.println(i);
                    }else{
                        if(i%j == 0){
                            break;
                        }
                    }
                }
            }
        }
    }
}
