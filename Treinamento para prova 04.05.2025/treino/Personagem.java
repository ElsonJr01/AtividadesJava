package treino;

public class Personagem {
    public String nome;
    public String classe;
    public Arma arma;
    public boolean vivo = true;
    public Double energia = 100.0;

    public Personagem(String nome, String guerreiro, Arma faca) {
        this.nome = nome;
        this.classe = classe;
        this.arma = arma;
    }

    void entrarEmBatalha(Arma arma) {
        if (energia >= 100) {
            System.out.println("Personagem pronto para luta");
        }
    }
    void atacar(Double intensidade){
        if(energia >= intensidade){
            System.out.println("Personagem atacando");
        }
        else if (energia < intensidade) {
            System.out.println("Personagem sofrendo dano");
        }
    }
    int nivelDeEnergia(Double energia) {
       if(energia >= 80) {
           return 4;
       }
       else if (energia >= 60 && energia < 80) {
           return 3;
       }
       else if (energia >= 40 && energia < 60) {
           return 2;
       }
       else if (energia >= 20 && energia < 40) {
           return 1;
       }
       else {
           return 0;
       }
    }

}
