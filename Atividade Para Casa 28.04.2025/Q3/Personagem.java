package Q3;

public class Personagem {
    public String nome;
    public String classe;
    public Arma arma;
    public boolean vivo = true;
    public double energia = 100;

    public Personagem(String nome, String classe, Arma arma) {
        this.nome = nome;
        this.classe = classe;
        this.arma = arma;
    }

    public void entrarEmBatalha() {
        System.out.println(nome + " entrou em batalha com uma " + arma.tipo + "!");
    }

    public void atacar(Double intensidade) {
        if (!vivo) {
                System.out.println(nome + " está morto e não pode atacar.");
                return;
        }
        double danoCausado = intensidade * arma.dano;
                energia -= intensidade * 2;

        if (energia <= 0) {
                energia = 0;
                vivo = false;
                System.out.println(nome + " caiu em batalha após o ataque.");
        }
                    else {
                            System.out.println(nome + " atacou com " + arma.tipo + " e causou " + danoCausado + " de dano.");
                            System.out.println("Energia restante: " + energia);
        }
    }

    public int nivelDeEnergia() {
        if (energia == 0) return 0;
                else if (energia <= 20) return 1;
                else if (energia <= 40) return 2;
                else if (energia <= 60) return 3;
                else if (energia <= 80) return 4;
                else return 5;
    }
}