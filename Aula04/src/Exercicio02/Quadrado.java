package Exercicio02;

import Exercicio02.FigurasGeometricas;

public abstract class Quadrado extends FigurasGeometricas {
    double base;
    double altura;

    @Override
    public void area() {
        double area = (this.base * this.altura);
        System.out.println("A área do Exercicio02.Quadrado é" + area);
    }
}
