package Q2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String nivel;
    private String descricao;
    private int cargaHoraria;
    private List<Instrutor> instrutores;

    public Curso(String nome, String nivel, String deescricao, int cargaHoraria, Instrutor instrutorInicial) {
        this.nome = nome;
        this.nivel = nivel;
        this.descricao = deescricao;
        this.cargaHoraria = cargaHoraria;
        this.instrutores = new ArrayList<>();
        this.instrutores.add(instrutorInicial); //serve para já adicionar o instrutor

    }
    public void mostrarCurso(){
        System.out.println("Caracteristicas do Curso: ");
        System.out.println("Nome: " + nome);
        System.out.println("Periodo: " + nivel);
        System.out.println("Descricao: " + descricao);
        System.out.println("Carga Horaria: " + cargaHoraria);
        System.out.println("\n");
        System.out.println("Instrutores: ");
        for (Instrutor i : instrutores) {
            System.out.println("Instrutor: " + i);
        }
    }
    public void adicionarInstrutor(Instrutor instrutor){
        instrutores.add(instrutor);
        System.out.println("Adicionando instrutor: " + instrutor);
    }
}
