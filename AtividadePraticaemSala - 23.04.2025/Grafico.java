package AtividadePraticaemSala;

public class Grafico {
    int x;
    int y;
    boolean n = true;
    char am;

    public Grafico() {


    }


    void plota(int valor ) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
              if(x%valor == 0) {
                  System.out.println(" X ");
              }
            }
            System.out.println("\n");
        }
    }
}
