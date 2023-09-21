public class Circulo {
    private double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }public double calcularArea() {return Math.PI * Math.pow(raio, 2);
    } public double calcularCircunferencia() { return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        double area = circulo.calcularArea();
        double circunferencia = circulo.calcularCircunferencia();

        System.out.println("Raio do círculo: " + circulo.raio);
        System.out.println("Área do círculo: " + area);
        System.out.println("Circunferência do círculo: " + circunferencia);
    }
}
