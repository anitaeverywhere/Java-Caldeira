import java.util.Scanner;
public class converteTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma temperatura EM CELSIUS");
        int temperaturaCelsius = Scanner(System.in);
        int temperaturaFahrenheit = ((temperaturaCelsius  * 9) /5) + 32;
        System.out.println("A temperatura inserida convertida em fahrenheit é" + temperaturaFahrenheit);

        scanner.close();
    }
}