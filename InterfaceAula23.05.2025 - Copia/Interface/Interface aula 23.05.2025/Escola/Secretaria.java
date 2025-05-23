package Escola;

public class Secretaria extends Funcionario implements PresencaRegistravel {
    protected String nome;
    protected String matricula;

    public Secretaria(String nome, String matricula) {
        super(nome);
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void registrarPresenca(){
        System.out.println("Registrado com sucesso!");
    }
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }

    @Override
    public void registrarPresenca(Funcionario funcionario) {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Presenca registrada com sucesso!");
    }

}
