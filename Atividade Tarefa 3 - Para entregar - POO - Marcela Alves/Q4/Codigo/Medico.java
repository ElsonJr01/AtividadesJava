package Q4;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nome;
    private List<Consulta> consultas;

    public Medico(String nome){
        this.nome = nome;
        this.consultas = new ArrayList<>();
    }
    public void adicionarConsulta(Consulta consulta){
        consultas.add(consulta);
        System.out.println("Adicionando consulta: " + consulta);
    }
    public String getNome(){
        return nome;
    }
    public List<Consulta> getConsultas(){
        return consultas;
    }
    public String toString(){
        return nome;
    }
}
