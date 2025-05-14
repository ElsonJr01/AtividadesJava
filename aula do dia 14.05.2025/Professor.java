package Aula14;

public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void ministrarDisciplina(Disciplina disciplina){
        System.out.println(nome + " esta ministrando as disciplinas: +" + disciplina.getDescricao());
    }

}
