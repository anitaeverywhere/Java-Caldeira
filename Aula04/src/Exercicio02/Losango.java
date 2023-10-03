package Exercicio02;

import Exercicio02.FigurasGeometricas;

public abstract class Losango extends FigurasGeometricas {
    double diagonalMaior;
    double diagonalMenor;

    @Override
    public void area() {
        double area = (this.diagonalMaior * this.diagonalMenor) / 2;
        System.out.println("A área do Exercicio02.Losango é" + area);
    }
}
