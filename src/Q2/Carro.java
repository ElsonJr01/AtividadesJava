package Q2;

public class Carro {
    public String cor;
    public String modelo;
    public Motor motor;


    public boolean ligado = false;
    public double velocidade = 0;


    public Carro(String cor, String modelo, Motor motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.motor = motor;
    }


    public void liga() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado!");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }


    public void acelera(Double qtd) {
        if (ligado) {
            velocidade += qtd;
            System.out.println("Acelerando: " + qtd + " km/h. Velocidade atual: " + velocidade + " km/h.");
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }


    public int pegaMarcha() {
        if (velocidade == 0) return 0;
        else if (velocidade <= 20) return 1;
        else if (velocidade <= 40) return 2;
        else if (velocidade <= 60) return 3;
        else if (velocidade <= 80) return 4;
        else return 5;
    }
}

