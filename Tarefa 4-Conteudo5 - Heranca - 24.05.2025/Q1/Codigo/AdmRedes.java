package TarefaConteudoHeranca.src.Tarefa4Conteudo5Heranca.Q1.Codigo;

public class AdmRedes extends FuncionarioTI {
    private String certificacao;
    private String SOResponsavel;

    public AdmRedes(String certificacao, String SOResponsavel, int matricula, String nome) {
        super(nome, matricula);
        this.certificacao = certificacao;
        this.SOResponsavel = SOResponsavel;
    }

    public String getSOResponsavel() {
        return SOResponsavel;
    }

    public void setSOResponsavel(String SOResponsavel) {
        this.SOResponsavel = SOResponsavel;
    }

    public String getCertificacao() {
        return certificacao;
    }

    public void setCertificacao(String certificacao) {
        this.certificacao = certificacao;
    }
    public void monitorarRedes(){
        System.out.println("SO Responsavel: " + SOResponsavel);

    }
    public void realizarBackup(){
        System.out.println("Backup realizado com sucesso");
    }

}
