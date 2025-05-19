package Q1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(" Elson " , " 9829jedn " , 25);
        Carro carro1 = new Carro(" Ford Ka " , " QDD-9876 ", "Azul", 2026);
        Carro carro2 = new Carro(" Fiat Punto " , " OBB-8734 ", " Branco ", 2020);

        p1.usarCarro(carro1);
        p1.usarCarro(carro2);

        p1.adicionarCarro(carro1);
        p1.adicionarCarro(carro2);
        p1.mostrarHistorico();
    }
}