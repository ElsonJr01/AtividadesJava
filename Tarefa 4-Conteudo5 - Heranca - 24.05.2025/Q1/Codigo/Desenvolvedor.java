package TarefaConteudoHeranca.src.Tarefa4Conteudo5Heranca.Q1.Codigo;

public class Desenvolvedor extends FuncionarioTI {
    private String linguagemPrincipal;
    private String nivel;

    public Desenvolvedor(String linguagemPrincipal, String nivel, String nome, int matricula) {
        super(nome, matricula);
        this.linguagemPrincipal = linguagemPrincipal;
        this.nivel = nivel;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public void desenvolverProjeto(){
        System.out.println("Desenvolvendo projeto");
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
        System.out.println("Nivel: " + nivel);
    }
    public void atualizarProjeto(){
        System.out.println("Atualizando projeto");
    }
    public void exibirTecnologiaUsada(){
        System.out.println("Exibindo Tecnologia usada");
    }
    public void revisarCodigo(){
        System.out.println("Revisando codigo");
    }

}
