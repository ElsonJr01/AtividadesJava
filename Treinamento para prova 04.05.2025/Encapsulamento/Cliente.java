package Encapsulamento;

public class Cliente {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}
