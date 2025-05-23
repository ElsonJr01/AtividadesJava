package SimuladordeSonseMovimentosdeAnimals;

public class Papagaio extends Animal {
    public Papagaio(String nome) {
        super(nome);
    }
    public void emitirSom() {
        System.out.println(nome + "Curupacu");
    }

    public void emitirSom(String frase){
        System.out.println("Papagaio fala " + frase);
    }
    @Override
    public void mover() {
        System.out.println("Voando");
    }
}
