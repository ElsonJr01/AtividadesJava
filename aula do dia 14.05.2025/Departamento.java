package Aula14;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String descricao;
    private List<Professor> professor;


    public Departamento(String decricao){
        this.descricao = decricao;
        this.professor = new ArrayList<>();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }
    public void adicionarProfessor(Professor prof){
        this.professor.add(prof);
        System.out.println(" faculdade: " + descricao + " do professor: " + professor.get(0).getNome());
    }
}
