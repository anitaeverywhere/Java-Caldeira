package Exercicio01;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
public class ArmazenarLivros {
    public static void main(String[] args) {
        int n = 4;
        Stack<Livros> Livros = new Stack<>();
        Livros HomemDeGiz = new Livros("Homem de Giz", "Terror");
        Livros Azeitona = new Livros("Azeitona", "Romance");
        Livros Maus = new Livros("Maus", "Conto");
        Livros BoaNoite = new Livros("Boa Noite PunPun", "Anime");

        Livros.push(HomemDeGiz);
        Livros.push(Azeitona);
        Livros.push(Maus);
        Livros.push(BoaNoite);
        System.out.println("Os livros da pilha são: " + Livros);

     Stack<Livros> livrosTerror = new Stack<>();
     for (Livros livro : Livros){
         if (livro.Categoria == "livrosTerror"){
             System.out.println("Esse livro" + livro.Titulo + "é da categoria terror");
             livrosTerror.push(livro);
         }
     }

        Livros.removeAll(livrosTerror);
     for (Livros i: Livros){
         System.out.println(i.Titulo);
     }

}
    }

