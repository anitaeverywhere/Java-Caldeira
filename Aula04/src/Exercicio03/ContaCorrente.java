package Exercicio03;

import Exercicio03.Conta;

public class ContaCorrente extends Conta implements Tributavel {
    double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double calculaTributos() {
        return saldo * 0.01;
    }

    public static class SeguroDeVida implements Tributavel {
        @Override
        public double calculaTributos() {
            return 42.0;
        }


    }
}


