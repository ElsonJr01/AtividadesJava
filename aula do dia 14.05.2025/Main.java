package Aula14;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Elson");
        Disciplina disciplina = new Disciplina("POO");
        Disciplina disciplina2 = new Disciplina("IHC");


        professor.ministrarDisciplina(disciplina); //Associação entre professor e disciplina
        professor.ministrarDisciplina(disciplina2);
        
        //agregação
        Departamento dComp = new Departamento("Fec");
        dComp.adicionarProfessor(professor);

        //Composição
        Universidade universidade = new Universidade("Unifesspa");
        universidade.adicionarDepartamento(dComp.getDescricao());
        universidade.listarDepartamentos(universidade.getDescricao());


    }
}
