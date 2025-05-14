package Aula14;

import java.util.List;

public class Disciplina {
    private String descricao;
    private List<Disciplina>Disciplina;

    public Disciplina(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void listarDisciplina(){
        System.out.println("Disciplina: " + this.descricao);
    }
}
