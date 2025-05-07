package Q2Gepeto;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto("Elson", 20.0);
        p1.exibirProduto();
        p1.setPreco(25.0);
        p1.exibirProduto();
    }
}
