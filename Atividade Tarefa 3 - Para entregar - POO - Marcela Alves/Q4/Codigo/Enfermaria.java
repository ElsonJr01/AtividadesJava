package Q4;

import java.util.ArrayList;
import java.util.List;

public class Enfermaria {
      private String nome;
      private List<Medico> medicos;

      public Enfermaria(String nome){
          this.nome = nome;
          this.medicos = new ArrayList<>();
      }
      public void adicionarMedico(Medico medico){
          medicos.add(medico);
          System.out.println("Adicionando medico: " + medico);
      }
      public String getNome(){
          return nome;
      }
      public String toString(){
          return nome;
      }
}
