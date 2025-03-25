package Carrinhos;

class Carros {
    String marca;
    String modelo;
    int anoFabricação = 2020;

    void atualizarAno(int novoAno){
        System.out.println("Ano do carro "+ anoFabricação);
    }
    void marcaCarro(String carroz){
        System.out.println(carroz);
    }
    void modeloCarro(String modelos){
        System.out.println("Modelo" + modelo);
    }
    void exibirDetalhes(int novoAno){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo" + modelo);
        System.out.println("Ano do carro "+ anoFabricação);
        System.out.println("Ano novo "+ novoAno);
    }
}
 public class TesteCarros {
    public static void main(String[] args) {
        Carros carro1 = new Carros();
        carro1.marca = "Chevrolet";
        carro1.modelo = " S10";
        carro1.atualizarAno(2025);
        carro1.marcaCarro("Ferrari");
        carro1.modeloCarro("Ferrari 751");
        carro1.exibirDetalhes(2025);
    }
}