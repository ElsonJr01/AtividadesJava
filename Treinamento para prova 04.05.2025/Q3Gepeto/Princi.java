package Q3Gepeto;

public class Princi {
    public static void main(String[] args) {
        ContaBancaria p1 = new ContaBancaria(200, "Elson");
        p1.depositar(2000);
        System.out.println("\nSaldo apos o deposito: " + p1.getSaldo());
        p1.sacar(1000);
        System.out.println("\nsaldo apos o saque: " + p1.getSaldo());
        p1.sacar(2300000);
        System.out.println("\nSaldo atual " + p1.getSaldo());
    }
}
