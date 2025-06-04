package TratamentodeExcecoes;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(234, 600);
        Conta c2 = new Conta(345, 700);

        try{
            c1.deposita(-49);

        } catch(IllegalArgumentException e){
            System.out.println("Erro ao depositar\n" + e.getMessage());
        }
        try{
            c2.deposita(50);

        } catch(IllegalArgumentException e){
            System.out.println("Erro ao depositar\n" + e.getMessage());
        }
        System.out.println("Saldo atual: " + c1.getSaldo());
        System.out.println("Saldo atual: " + c2.getSaldo());

        try{
            c1.saca(-660);
        } catch(IllegalArgumentException e){
            System.out.println("Erro ao sacar\n" + e.getMessage());
        }
        try{
            c2.saca(50);
        } catch(IllegalArgumentException e){
            System.out.println("Erro ao sacar\n" + e.getMessage());
        }
        System.out.println("Saldo atual: " + c1.getSaldo());
        System.out.println("Saldo atual: " + c2.getSaldo());
    }
}