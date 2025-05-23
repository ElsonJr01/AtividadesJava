package SimuladordeSonseMovimentosdeAnimals;

public class Vaca extends Animal {
    public Vaca(String nome){
        super(nome);
    }

    public void emitirSom() {
        System.out.println(nome + "faz Mu!!!");
    }
    public void mover() {
        System.out.println("Andando");
    }
}
