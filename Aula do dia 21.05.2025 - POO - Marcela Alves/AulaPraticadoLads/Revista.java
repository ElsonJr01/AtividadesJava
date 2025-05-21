package AulaPraticadoLads;

public class Revista extends MaterialBibliografico{
    private double mesAnoEdicao;
    private String titulo;
    private int codigo;

    public Revista(String titulo, int codigo, double mesAnoEdicao){
        super(titulo, codigo);
        this.mesAnoEdicao = mesAnoEdicao;
        this.titulo = titulo;
        this.codigo = codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setMesAnoEdicao(double mesAnoEdicao) {
        this.mesAnoEdicao = mesAnoEdicao;
    }
    public double getMesAnoEdicao() {
        return mesAnoEdicao;
    }
    public void emprestar(){
        super.emprestar();
        System.out.println("Revista emprestada: " + getTitulo() + "Codigo da revista: " + getCodigo() + "Mes e edicao: " + getMesAnoEdicao());
    }
    public void verificarAnoAtual(){
        if(getMesAnoEdicao() > 2021){

        }
    }
}
