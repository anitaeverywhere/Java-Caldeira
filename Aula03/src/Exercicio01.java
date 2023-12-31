import java.time.LocalDateTime;
public class ContaBancaria {
    private String nome;
    private String cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalDateTime horarioAtual;
    public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = LocalDateTime.now();
    }
    public void saque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void pix(double valor) {
        if (horarioAtual.getHour() >= 8 && horarioAtual.getHour() < 19) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Transferência PIX de R$" + valor + " realizada com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar a transferência PIX.");
            }
        } else {
            System.out.println("Transferência PIX disponível apenas das 8hrs às 19hrs.");
        }
    }
    public void transferencia(ContaBancaria destino, double valor) {
        if (horarioAtual.getHour() >= 8 && horarioAtual.getHour() < 19) {
            if (saldo >= valor) {
                saldo -= valor;
                destino.deposito(valor);
                System.out.println("Transferência de R$" + valor + " para " + destino.nome + " realizada com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar a transferência.");
            }
        } else {
            System.out.println("Transferência disponível apenas das 8hrs às 19hrs.");
        }
    }
    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void verificarHorario() {
        System.out.println("Horário atual: " + horarioAtual);
    }

    public void verificarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Identificador da Conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço: " + endereco);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Horário atual: " + horarioAtual);
    }
}
}