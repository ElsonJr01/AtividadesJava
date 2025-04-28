package Q3;

public class Main {
    public static void main(String[] args) {
        Arma espada = new Arma(10.0, "Espada");
        Personagem guerreiro = new Personagem("Arthur", "Guerreiro", espada);

        guerreiro.entrarEmBatalha();
        guerreiro.atacar(5.0);

        int nivel = guerreiro.nivelDeEnergia();
        System.out.println("Nível de energia de " + guerreiro.nome + ": " + nivel);

    }
}
