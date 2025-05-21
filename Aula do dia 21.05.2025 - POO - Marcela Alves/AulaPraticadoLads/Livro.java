package AulaPraticadoLads;

public class Livro extends MaterialBibliografico {
    private String autor;
    private double ISBN;

    public Livro(String autor, double ISBN, String titulo, int codigo) {
        super(titulo, codigo);
        this.autor = autor;
        this.ISBN = ISBN;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setISBN(double iSBN) {
        ISBN = iSBN;
    }
    public String getAutor() {
        return autor;
    }
    public double getISBN() {
        return ISBN;
    }
    public void emprestar() {
        super.emprestar();
        System.out.println("Livro emprestado: " + getTitulo());
        System.out.println("Autor do livro: " + getAutor());
        System.out.println("ISBN do livro: " + getISBN());
    }
}
