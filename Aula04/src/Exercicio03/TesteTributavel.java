package Exercicio03;

import Exercicio03.ContaCorrente;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(4000.0);
        ContaCorrente.SeguroDeVida seguroDeVida = new ContaCorrente.SeguroDeVida();
        double tributoContaCorrente = contaCorrente.calculaTributos();
        double tributoSeguroDeVida = seguroDeVida.calculaTributos();

        System.out.println("Tributo da Exercicio03.Conta Corrente: " + tributoContaCorrente + " reais");
        System.out.println("Tributo do Seguro de Vida: " + tributoSeguroDeVida + " reais");
    }
}

