package Escola;

public class Main {
    public static void main(String[] args) {
        Secretaria secretaria = new Secretaria("Elson" , "239804");
        Diretor diretor = new Diretor("papagaio", "276387372");
        Professor professor = new Professor("Marcela", "92349278", "039497", "elson.sousa@gmail.com");
        Tercerizado tercerizado = new Tercerizado("Luva de pedreiro", "Jogador");

        System.out.println("Dados dos Funcionarios");
        System.out.println(tercerizado.getNome());
        tercerizado.exibirDados();
        tercerizado.registrarPresenca();
        System.out.println("-----------------------------------------------------------------");
        System.out.println(diretor.getNome());
        diretor.exibirDados();
        diretor.tomarDecisao();
        System.out.println("-----------------------------------------------------------------");
        System.out.println(professor.getNome());
        professor.exibirDados();
        professor.registrarPresenca();
        System.out.println("-----------------------------------------------------------------");
        System.out.println(secretaria.getNome());
        secretaria.exibirDados();
        secretaria.registrarPresenca();
        System.out.println("------------------------------------------------------------------");


    }
}
