package Escola;

public class Tercerizado extends Funcionario implements PresencaRegistravel {
    protected String nome;
    protected String descricao;

    public Tercerizado(String nome, String descricao) {
        super(nome);
        this.nome = nome;
        this.descricao = descricao;
    }
    public void registrarPresenca() {
        System.out.println("Registrado com sucesso!");
    }
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
    }

    @Override
    public void registrarPresenca(Funcionario funcionario) {
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("presenca registradoa com sucesso!");
    }

}
