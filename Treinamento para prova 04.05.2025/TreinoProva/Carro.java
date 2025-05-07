package TreinoProva;

public class Carro {
    String marca;
    int ano;

    public Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }
    public void exibirInformacoes(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
    }
}
