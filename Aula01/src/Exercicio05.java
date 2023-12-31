import java.util.Calendar;

public class LerHorasESegundos {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();
        int horaAtual = agora.get(Calendar.HOUR_OF_DAY);
        int minutoAtual = agora.get(Calendar.MINUTE);
        int segundoAtual = agora.get(Calendar.SECOND);
        int segundosDesdeMeiaNoite = horaAtual * 3600 + minutoAtual * 60 + segundoAtual;
        int segundosRestantes = 24 * 3600 - segundosDesdeMeiaNoite;
        System.out.println("Segundos desde a meia-noite: " + segundosDesdeMeiaNoite);
        System.out.println("Segundos restantes até a meia-noite: " + segundosRestantes);
    }
}
