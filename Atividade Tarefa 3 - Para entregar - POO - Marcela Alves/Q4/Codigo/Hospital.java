package Q4;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private List<Enfermaria> unidades;
    private List<Paciente> pacientes;

    public Hospital(String nome){
        this.nome = nome;
        this.unidades = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void adicionarUnidade(Enfermaria unidade){
        unidades.add(unidade);
        System.out.println("Adicionando unidade: " + unidade.getNome());
    }
    public void adicionarPaciente(Paciente paciente){
        pacientes.add(paciente);
        System.out.println("Adicionando paciente: " + paciente);
    }
}
