package SimuladordeSonseMovimentosdeAnimals;

public abstract class Animal {
    protected String nome;

    public Animal(String Vaca) {
        this.nome = nome;
    }
    public void setVaca(String vaca) {
        nome = nome;
    }
    public String getVaca() {
        return nome;
    }
    public void emitirSom() {
        System.out.println(nome + "Animal que emite som");
    }
    public abstract void mover();
}
