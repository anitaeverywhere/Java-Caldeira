public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(4000.0);
        ContaCorrente.SeguroDeVida seguroDeVida = new ContaCorrente.SeguroDeVida();
        double tributoContaCorrente = contaCorrente.calculaTributos();
        double tributoSeguroDeVida = seguroDeVida.calculaTributos();

        System.out.println("Tributo da Conta Corrente: " + tributoContaCorrente + " reais");
        System.out.println("Tributo do Seguro de Vida: " + tributoSeguroDeVida + " reais");
    }
}

