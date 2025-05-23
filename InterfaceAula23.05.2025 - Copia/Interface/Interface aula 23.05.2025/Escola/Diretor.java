package Escola;

public class Diretor extends Funcionario {
    protected String nome;
    protected String matricula;
    protected String setor;

    public Diretor(String nome, String matricula) {
        super(nome);
        this.nome = nome;
        this.matricula = matricula;
    }
    public void setor(String setor) {
        this.setor = setor;
    }
    public void tomarDecisao(){
        System.out.println("Em reuniao");
    }

}
