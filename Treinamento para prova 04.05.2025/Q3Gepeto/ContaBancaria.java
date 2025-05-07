package Q3Gepeto;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public String getTitular() {
        return this.titular;
    }
    public void depositar(double valor) {
       if(valor > 0){
           this.saldo += valor;
       }
       else {
           System.out.println("Valor do deposito invalido");
       }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.print("Saque de R$: " + valor + " efetuado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente: " + valor);
        }
    }
}
