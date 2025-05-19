package Q4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital Central");

        // Criando unidades
        Enfermaria enfermaria1 = new Enfermaria("Enfermaria Geral");
        Enfermaria prontoSocorro = new Enfermaria("Pronto Socorro");

        // Adicionando unidades ao hospital
        hospital.adicionarUnidade(enfermaria1);
        hospital.adicionarUnidade(prontoSocorro);

        // Criando médicos
        Medico medico1 = new Medico("Dr. Elson");
        Medico medico2 = new Medico("Dra. MArgarida");

        // Adicionando médicos às unidades
        enfermaria1.adicionarMedico(medico1);
        prontoSocorro.adicionarMedico(medico2);

        // Criando pacientes
        Paciente paciente1 = new Paciente("Carlos Silva", "123.456.789-10");

        // Adicionando paciente ao hospital
        hospital.adicionarPaciente(paciente1);

        // Criando consulta
        Consulta consulta1 = new Consulta(LocalDate.now(), "Consulta de rotina", paciente1, medico1);


        // Associando consulta ao médico
        medico1.adicionarConsulta(consulta1);

        // Exibindo resumo da consulta
        System.out.println("\nResumo da consulta:");
        consulta1.getResumo();
    }
}
