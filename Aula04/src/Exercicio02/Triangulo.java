package Exercicio02;

import Exercicio02.FigurasGeometricas;

public abstract class Triangulo extends FigurasGeometricas {
    double base;
    double altura;

    @Override
    public void area() {
        double area = (this.base * this.altura) / 2;
        System.out.println("A área do Exercicio02.Triangulo é" + area);
    }
}
