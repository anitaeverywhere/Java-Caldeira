public abstract class Circulo extends FigurasGeometricas{
    double raio;
    @Override
    public void area() {
        double area = (this.raio * this.raio) * Math.PI;
        System.out.println("A área do círculo é" + area);

    }
}
