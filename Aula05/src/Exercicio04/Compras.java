package Exercicio04;

public class Compras {
    private String nome;
    private String dataDeValidade;
    private String descricao;

    public Compras(String nome, String dataDeValidade, String descricao) {
        this.nome = nome;
        this.dataDeValidade = dataDeValidade;
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public String getDescricao() {
        return descricao;
    }


}

