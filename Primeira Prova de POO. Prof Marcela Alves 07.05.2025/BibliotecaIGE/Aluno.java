package BibliotecaIGE;
/**
 * Primeira prova da materia de POO no dia 07/05/2025, resolvi não mexer no algoritmo e postar da forma que eu fiz
 */
public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    private void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
}
