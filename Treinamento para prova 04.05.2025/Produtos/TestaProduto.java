package Produtos;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produ = new Produto("ELson", 20, new Data(05, 05, 2025));
        Produto produ2 = new Produto("Jessica", 29, new Data(06, 02, 2055));
        Produto produ3 = new Produto("Jessica", 29, new Data(06, 02, 2000));

        System.out.println("\nProduto esta vencido ? " + produ.valida());
        System.out.println("Produto esta Vencido ? " + produ2.valida());
        System.out.println("Produto esta Vencido ? " + produ3.valida());

    }
}
