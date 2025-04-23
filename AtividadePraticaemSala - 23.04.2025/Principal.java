package AtividadePraticaemSala;

class Circulo{ //passo 1 declarar a classe

    int x;
    int y;
    int raio;

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    void mostrarArea(int raio) {     //passo 3: declarar os metodos
    float area = (float) (3.14 * (raio * raio));
    System.out.println("Area: " + area);
    }
}
