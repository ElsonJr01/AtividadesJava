package Q4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital Central");

        
                        Enfermaria enfermaria1 = new Enfermaria("Enfermaria Geral");
                        Enfermaria prontoSocorro = new Enfermaria("Pronto Socorro");
                
                        
                        hospital.adicionarUnidade(enfermaria1);
                        hospital.adicionarUnidade(prontoSocorro);
                
                      
                        Medico medico1 = new Medico("Dr. Elson");
                        Medico medico2 = new Medico("Dra. MArgarida");
                
                        
                            enfermaria1.adicionarMedico(medico1);
                            prontoSocorro.adicionarMedico(medico2);

                        Paciente paciente1 = new Paciente("Carlos Silva", "123.456.789-10");
                
                        hospital.adicionarPaciente(paciente1);

                            Consulta consulta1 = new Consulta(LocalDate.now(), "Consulta de rotina", paciente1, medico1);
                        
                            medico1.adicionarConsulta(consulta1);

        System.out.println("\nResumo da consulta:");
        consulta1.getResumo();
    }
}
