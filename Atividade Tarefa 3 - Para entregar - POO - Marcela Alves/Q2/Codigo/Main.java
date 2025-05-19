package Q2;

public class Main {
    public static void main(String[] args) {
        Instrutor instrutor1 = new Instrutor(" Elson " , " Engenharia " , " elson.sousa@unifesspa.edu.br " , 10);
        Curso curso1 = new Curso("Matematica ", "Terceiro " , "Curso de EDO", 100, instrutor1);

        instrutor1.mostrarInstrutor();
        System.out.println("\n");
        curso1.mostrarCurso();
        System.out.println("\n");
        curso1.adicionarInstrutor(instrutor1);
    }
}
