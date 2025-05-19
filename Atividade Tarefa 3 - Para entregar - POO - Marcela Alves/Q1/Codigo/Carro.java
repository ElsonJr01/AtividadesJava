package Q1;

/**
 * usei o metodo toString que vi neste link: https://www.youtube.com/watch?v=62qcGF6IVfc
 */

import java.util.List;

public class Carro {
    private String modelo;
    private String placa;
    private String cor;
    private int ano;

    public Carro(String modelo, String placa, String cor, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
    }
    public void dirigir(){
        System.out.println("Carro: " + this.modelo + "Placa: " + this.placa + "Cor: " + this.cor + "Ano: " + this.ano);
    }
    public String toString(){
        return "Carro: " + this.modelo + "Placa: " + this.placa + "Cor: " + this.cor + "Ano: " + this.ano;
    }
}
