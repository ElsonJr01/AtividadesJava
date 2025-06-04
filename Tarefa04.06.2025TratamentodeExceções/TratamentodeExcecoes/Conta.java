package TratamentodeExcecoes;

public class Conta {
    private double saldo;
    private double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void deposita(double valor) throws IllegalArgumentException {
        if (valor < 0){
            throw new IllegalArgumentException("Valor invalido");
        }
        else {
            saldo += valor;
        }
    }
    public void saca(double valor) throws IllegalArgumentException {
        if (valor < 0){
            throw new IllegalArgumentException("Valor invalido");
        }
        else {
            saldo -= valor;
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return limite;
    }

}
