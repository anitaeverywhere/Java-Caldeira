import java.util.HashMap;
import java.util.Map;
public class NomesDePessoas {
    public static void main(String args[]){
        Map<String, Integer> nomeIdade = new HashMap<String, Integer>();
        nomeIdade.put("Andria", 65);
        nomeIdade.put("Santana", 70);
        nomeIdade.put("Marco", 16);
        nomeIdade.put("Maria",17);
        nomeIdade.put("Matheus",69);

        String NomeDaPessoa = "Matheus";
        if (nomeIdade.containsKey(NomeDaPessoa)){
            int idade = nomeIdade.get(NomeDaPessoa);
            System.out.println(NomeDaPessoa + "tem" + idade);
        }
      else {
            System.out.println(NomeDaPessoa + "Não está no mapa");
        }





    }
}
