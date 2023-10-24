package Exercicio06;


public class Reserva {
    private int nome;
    private int origem;
    private int destino;
    private int cpf;
    private int saida;
    private int entrada;
    public Reserva ( int nome, int origem, int cpf, int saida, int entrada, int destino){
        this.cpf = cpf;
        this.origem = origem;
        this.saida = saida;
        this.nome = nome;
        this.entrada = entrada;
        this.destino = destino;
    }


    public int getCpf() {
        return cpf;
    }

    public int getEntrada() {
        return entrada;
    }

    public int getSaida() {
        return saida;
    }

    public int getOrigem() {
        return origem;
    }
    public int getNome() {
        return nome;
    }
    public int getDestino() {
        return destino;
    }
}

