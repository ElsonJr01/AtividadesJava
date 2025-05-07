package Produtos;

public class Produto {
    private String nome;
    private double preco;
    private Data validade;

    public Produto(String nome, double preco, Data validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }

    public boolean valida() {
        Data dataAtual = new Data(5,5,2025);
        return validade.validade(dataAtual);
    }

}
