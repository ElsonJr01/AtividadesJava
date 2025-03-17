package AtividadeTarefa;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void cadastrar() {
        System.out.println("Cadastrando usuário: " + nome);
        System.out.println("Email: " + email);
    }
    public void alterarEmail( String novoEmail) {
        this.email = novoEmail;
        System.out.println("Email de " + nome + " alterado com sucesso para " + email);
    }
}
