package TarefaConteudoHeranca.src.Tarefa4Conteudo5Heranca.Q1.Codigo;

public class Main {
    public static void main(String[] args) {
        AdmRedes adm = new AdmRedes("Ciencia de Dados", "Linux", 823, "Elson");
        Desenvolvedor desenvolvedor = new Desenvolvedor("C#", "Junior", "Joao", 83736);

        desenvolvedor.exibirDados();
        desenvolvedor.revisarCodigo();
        desenvolvedor.exibirTecnologiaUsada();
        desenvolvedor.atualizarProjeto();
        desenvolvedor.desenvolverProjeto();
        System.out.println("*****************************************");
        adm.exibirDados();
        adm.monitorarRedes();
        adm.realizarBackup();
        System.out.println("*****************************************");

    }
}
