package AtividadeTarefa;
public class CadastroUsuario {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João", "joao@example.com");
        Usuario usuario2 = new Usuario("Elson", "elson.sousa@unifesspa.edu.br");
        usuario1.cadastrar();
        usuario2.cadastrar();

        usuario1.alterarEmail("JorgeJesus@unifesspa.edu.br");
    }
}