import java.util.ArrayList;
import java.util.List;

public abstract class FigurasGeometricas {
    public void area(){
    }
    public static void main (String[]args){
        ArrayList <FigurasGeometricas> lista = new ArrayList<>();
        lista.add (new Retangulo[]);
        lista.add(new Circulo[]);
        lista.add(new Triangulo[]);
        lista.add(new Quadrado[]);
        lista.add(new Losango[]);
        for (FigurasGeometricas forma: lista){
            double area = forma.calcularArea();
            System.out.println("A área da figura geométrica é" + area);
        }


    }
    protected abstract double calcularArea();

}
