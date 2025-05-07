package BibliotecaIGE;

/**
 * Primeira prova da materia de POO no dia 07/05/2025, resolvi não mexer no algoritmo e postar da forma que eu fiz
 */

public class Main {
    public static void main(String[] args) {

        Bibiotecla bibliotecla = new Bibiotecla("Lisbela e o Prisioneiro", "Elson");
        Aluno p1 = new Aluno("Joao", 20345);
        Bibliotecario bibliotecario = new Bibliotecario("Marcela", 203344);

        System.out.println("Nome do Autor: " + bibliotecla.getNome() + "\nNome do Livro: " + bibliotecla.getLivro());
        System.out.println("\nNome do bibliotecario: " + bibliotecario.getNome() + "\nMatricula do Bibliotecario: " + bibliotecario.getMatricula());
        System.out.println("\nNome do aluno: " + p1.getNome() + "\nMatricula do aluno: " + p1.getMatricula());

    }
}
