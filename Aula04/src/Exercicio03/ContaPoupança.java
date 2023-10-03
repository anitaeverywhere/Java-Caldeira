package Exercicio03;

import Exercicio03.Conta;

public class ContaPoupança extends Conta implements Tributavel {

    @Override
    public double calculaTributos() {
        return 0;
    }
}
