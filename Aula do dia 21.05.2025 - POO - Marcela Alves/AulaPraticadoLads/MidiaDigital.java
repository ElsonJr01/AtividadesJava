package AulaPraticadoLads;

public class MidiaDigital extends MaterialBibliografico {
    private String formato;
    private double tamanho;
    private int totalDownload;

    public MidiaDigital(String titulo, int codigo, String formato, double tamanho, int totalDownload) {
        super(titulo, codigo);
        this.formato = formato;
        this.tamanho = tamanho;
        this.totalDownload = 0;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public void emprestar(){
        System.out.println("---------------------------------------");
        System.out.println("Midia digital emprestada: " + getFormato());
        System.out.println("Tamanho da midia: " + getTamanho());
        System.out.println("---------------------------------------");
    }
}
