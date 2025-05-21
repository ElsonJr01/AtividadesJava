package AulaPraticadoLads;

public class Main {
    public static void main(String[] args) {
      Livro livro1 = new Livro("Elson", 1233937, "Capitaes da areia", 234);
      livro1.emprestar();
      System.out.println("---------------------------------------");

      Revista revista1 = new Revista("Revista Pequena: ", 234, 2021);
      revista1.emprestar();
    }
}
