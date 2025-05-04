package treino;

public class Main {
    public static void main(String[] args) {
        Arma faca = new Arma("Faca", 20.0);
        Personagem guerreiro = new Personagem(" ELson", "Guerreiro", faca);

        guerreiro.entrarEmBatalha(faca);
        guerreiro.atacar(100.0);
        guerreiro.nivelDeEnergia(80.0);
        int nivel = guerreiro.nivelDeEnergia(60.0);

        System.out.println("Nivel de energia: "  + nivel + guerreiro.nome);
    }
}