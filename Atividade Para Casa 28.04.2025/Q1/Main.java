package Q1;

public class Main {
    public static void main (String args[]){
        Circulo circ = new Circulo (3,2,5);
        System.out.println("Identidade do bjeto: " + circ);
        circ.mostrarArea();

            Grafico g1 = new Grafico(true, '#');

            Grafico g2 = new Grafico(false, '*');

            Potencia p = new Potencia(1,7);
        System.out.println("\nGrafico 1: \n");
            p.conecta(g1);
            p.apresenta();
        System.out.println("\nGrafico 2: \n");
            p.conecta(g2);
            p.apresenta();
    }
}