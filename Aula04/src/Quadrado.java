public abstract class Quadrado extends FigurasGeometricas {
    double base;
    double altura;

    @Override
    public void area() {
        double area = (this.base * this.altura);
        System.out.println("A área do Quadrado é" + area);
    }
}
