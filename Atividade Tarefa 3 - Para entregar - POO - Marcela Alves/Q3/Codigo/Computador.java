package Q3;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRAM;
    private PlacaMae placaMae;

    public Computador(String marca, String modelo, String processador, int memoriaRAM, PlacaMae placaMae) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = new PlacaMae(" Mortorola ", " CasasHSS ", "Intel Core 400");
    }
    public void exibir(){
        System.out.println(" *******COMPUTADOR*********");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Processador: " + this.processador);
        System.out.println("Memoria RAM: " + this.memoriaRAM + "GB");
        this.placaMae.exibir();
    }
    public void atualizarCom(String marca, String modelo, String processador, int memoriaRAM, PlacaMae placaMae){
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = placaMae;
        System.out.println("Computador Atualizado.");
    }

}
