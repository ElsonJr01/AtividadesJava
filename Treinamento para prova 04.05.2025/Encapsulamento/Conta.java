package Encapsulamento;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;

    public Conta(int numero, double saldo, Cliente titular){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }
    void sacar(double saldo){
        this.saldo -= saldo;
    }
    void depositar(double saldo){
        this.saldo += saldo;
    }
    void setTitular(Cliente titular){
        this.titular = titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
