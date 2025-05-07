package Q2Gepeto;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    private void setNome(String nome){
        this.nome = nome;
    }
   public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
    public void exibirProduto(){
        System.out.println("Nome " + getNome());
        System.out.println("Preco R$ " + getPreco());
    }
}
