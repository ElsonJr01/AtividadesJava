package AulaPraticadoLads;

public class MaterialBibliografico {
    protected String titulo;
    protected int codigo;

    public MaterialBibliografico(String titulo, int codigo){
        this.titulo = titulo;
        this.codigo = codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void emprestar(){
        System.out.println("---------------------------------------");
        System.out.println("Material emprestado: " + getTitulo());
        System.out.println("Codigo do material: " + getCodigo());
        System.out.println("---------------------------------------");
    }

}
