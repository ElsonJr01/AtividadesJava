package Q1;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cnh;
    private int idade;
    private List<Carro> usarCarro;

    public Pessoa(String nome, String cnh, int idade) {
        this.nome = nome;
        this.cnh = cnh;
        this.idade = idade;
        this.usarCarro = new ArrayList<>();
    }

    public void usarCarro(Carro carro){
        System.out.println("Usando carro: " + carro);
        carro.dirigir();
    }
    public void adicionarCarro(Carro carro){
        usarCarro.add(carro);
        System.out.println("Adicionando carro: " + carro);
    }

    public void mostrarHistorico(){
        System.out.println("Historico de carros usados: " + usarCarro.size());
        for (Carro carro : usarCarro) {
            System.out.println("Carro: " + carro);
        }
    }

}
