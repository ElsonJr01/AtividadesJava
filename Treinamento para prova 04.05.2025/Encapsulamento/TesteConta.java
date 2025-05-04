package Encapsulamento;

public class TesteConta {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("ELson");
        Conta cliente = new Conta(1234, 100.0, cliente1);

        cliente.depositar(100.0);
        cliente.sacar(50.0);
        cliente1.setNome("ELson");
        System.out.println(cliente.getSaldo());
        System.out.println("O cliente " + cliente1.getNome() + " tem saldo de " + cliente.getSaldo());

    }
}
