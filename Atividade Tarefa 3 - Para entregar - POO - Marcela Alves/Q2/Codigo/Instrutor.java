package Q2;

public class Instrutor {
    private String nome;
    private String formacao;
    private String email;
    private int experiencia;

    public Instrutor(String nome, String formacao, String email, int experiencia) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.experiencia = experiencia;
    }
    public void mostrarInstrutor(){
        System.out.println("Nome: " + nome);
        System.out.println("Formacao: " + formacao);
        System.out.println("Email: " + email);
        System.out.println("Experiencia de trabalho em anos: " + experiencia + " anos");
    }
    public String toString(){
        return nome + " " + formacao + " " + email + " " + experiencia + " anos";
    }
}
