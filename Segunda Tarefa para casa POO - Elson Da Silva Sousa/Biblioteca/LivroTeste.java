package Biblioteca;

class Livro {
    String titulo;
    String autor;
    int anoDePublicacao;

    void exibirInfo(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println(anoDePublicacao);
    }
    void atualizarAno(int novoAno){
        this.anoDePublicacao = novoAno;
        System.out.println("Ano: " + this.anoDePublicacao);
    }
}
public class LivroTeste {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Livro 1";
        livro.anoDePublicacao = 1990;
        livro.autor = "Elson";
        livro.exibirInfo();
        livro.atualizarAno(1997);
        livro.exibirInfo();
        Livro livro2 = new Livro();
        livro2.titulo = "Livro 2";
        livro2.anoDePublicacao = 2000;
        livro2.autor = "Junior";
        livro2.exibirInfo();
        livro2.atualizarAno(2006);
        livro2.exibirInfo();
    }
}