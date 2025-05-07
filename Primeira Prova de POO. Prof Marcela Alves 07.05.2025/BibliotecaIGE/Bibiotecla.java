package BibliotecaIGE;

/**
 * Primeira prova da materia de POO no dia 07/05/2025, resolvi não mexer no algoritmo e postar da forma que eu fiz
 */
public class Bibiotecla {
    String Autor;
    String Livro;

    public Bibiotecla(String nome, String autor) {
        this.Livro = nome;
        this.Autor = autor;
    }

    private void setNome(String nome) {
        this.Autor = nome;
    }
    public String getNome() {
        return Autor;
    }
    private void setLivro(String livro) {
        this.Livro = livro;
    }
    public String getLivro() {
        return Livro;
    }
}
