package Aula14;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String descricao;
    private List<Departamento> departamentos;

    public Universidade(String descricao){
        this.descricao = descricao;
        this.departamentos = new ArrayList<Departamento>();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void adicionarDepartamento(String descricao){
        departamentos.add(new Departamento(descricao));
    }

    public void listarDepartamentos(String descricao) {
        System.out.println("Lista de Departamentos : " + this.departamentos.get(0).getDescricao());
        for(Departamento departamento : departamentos){
            System.out.println(departamento.getDescricao());
        }
    }
}
