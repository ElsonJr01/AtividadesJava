package Tarefa2ParaCasaAuladePOO;

class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;

    void mostrarInfor(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
    void alterarIdade(int novaIdade){
        this.idade = novaIdade;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
    void calcularImc(){
        float peso = (float)this.peso;
        float altura = (float)this.altura;
        double imc = peso/(altura*altura);
        System.out.println("IMC: " + imc);
    }
}
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Joao";
        pessoa1.idade = 25;
        pessoa1.altura =1.75;
        pessoa1.peso = 75.00;
        pessoa1.mostrarInfor();
        pessoa1.calcularImc();
        pessoa1.alterarIdade(26);
        pessoa1.calcularImc();
    }
}