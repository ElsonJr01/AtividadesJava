package Encapsulamento;

public class Conta {
private int numero;
private Double saldo;
private Cliente titular;

        public Conta(int numero, Double saldo, Cliente titular) {
            this.numero = numero;
            this.saldo = saldo;
            this.titular = titular;
        }
        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }
        public Double getSaldo() {
            return saldo;
        }
        public Cliente getTitular() {
            return titular;
        }
        public int getNumero() {
            return numero;
        }

        public boolean sacar(Double valor) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque efetuado");
                return true;
            } else {
                System.out.println("Saque não efetuado");
                return false;
            }
        }
        public void depositar(Double valor){
            if (valor <= 0) {
                System.out.println("erro");
                return;
            }
            System.out.println("Deposito efetuado");
            this.saldo += valor;
        }
}
