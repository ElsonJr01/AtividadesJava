package Encapsulamento;

public class TesteConta {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Silva");
        Cliente cliente2 = new Cliente("Maria");
        Conta conta1 = new Conta(1234, 100.0, cliente1);

        System.out.println("Nome do cliente: " + cliente1.getNome());
        cliente1.setNome("Elson");
        System.out.println("Nome do cliente: " + cliente1.getNome());
        System.out.println("Nome do cliente: " + cliente2.getNome());
        cliente2.setNome("Maria");
        System.out.println("Nome do cliente: " + cliente2.getNome());


    }
}
