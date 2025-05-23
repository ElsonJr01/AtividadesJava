package SimuladordeSonseMovimentosdeAnimals;

public class Main {
    public static void main(String[] args) {
        Vaca v1 = new Vaca("Mimosa");
        Papagaio p1 = new Papagaio("Cabuloso");

        p1.emitirSom();
        v1.emitirSom();
        p1.emitirSom("Papagaio");
    }
}
