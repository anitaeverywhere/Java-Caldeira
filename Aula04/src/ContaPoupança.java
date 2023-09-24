public class ContaPoupança extends Conta implements Tributavel {

    @Override
    public double calculaTributos() {
        return 0;
    }
}
