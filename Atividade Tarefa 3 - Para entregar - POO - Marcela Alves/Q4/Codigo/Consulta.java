package Q4;

import java.time.LocalDate;

public class Consulta {
    private LocalDate data;
    private String descricao;
    private Paciente paciente;
    private Medico medico;

    public Consulta(LocalDate data, String descricao, Paciente paciente, Medico medico){
        this.data = data;
        this.descricao = descricao;
        this.paciente = paciente;
        this.medico = medico;
    }
    public void getResumo(){
        System.out.println("Data: " + data);
        System.out.println("Descricao: " + descricao);
        System.out.println("Paciente: " + paciente);
        System.out.println("Medico: " + medico);
    }
    public String toString(){
        return "Consulta em: " + data;
    }
}
