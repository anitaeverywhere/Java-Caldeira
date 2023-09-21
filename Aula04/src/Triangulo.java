public abstract class Triangulo extends FigurasGeometricas {
    double base;
    double altura;

    @Override
    public void area() {
        double area = (this.base * this.altura) / 2;
        System.out.println("A área do Triangulo é" + area);
    }
}
