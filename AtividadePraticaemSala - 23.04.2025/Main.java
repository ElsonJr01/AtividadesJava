package AtividadePraticaemSala;

public class Main {
    public static void main(String[] args) {
        Circulo r = new Circulo(3,5,10);
        r.mostrarArea(10);
        Circulo circ = new Circulo(3, 5, 10);
        System.out.println("\nIdentidade: " + circ);

        Grafico asterisco = new Grafico();
        asterisco.plota(10);
    }
}
