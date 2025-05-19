package Q4;

public class Paciente {
    private String nome;
    private String cpf;

    public Paciente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String toString(){
        return nome + " CPF " + cpf;
    }
}
