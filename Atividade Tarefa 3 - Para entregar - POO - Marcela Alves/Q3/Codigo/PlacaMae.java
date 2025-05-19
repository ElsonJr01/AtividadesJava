package Q3;

public class PlacaMae {
    private String fabricante;
    private String chipset;
    private String tipoMemoria;

    public PlacaMae(String facbricante, String chipset, String tipoMemoria) {
        this.fabricante = facbricante;
        this.chipset = chipset;
        this.tipoMemoria = tipoMemoria;
    }

    public void exibir(){
        System.out.println(" *******PLACA MAE*********");
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Chipset: " + this.chipset);
        System.out.println("Memoria: " + this.tipoMemoria + "\n");
    }
    public void atualizar(String fabricante, String chipset, String tipoMemoria){
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.tipoMemoria = tipoMemoria;
        System.out.println("Placa Atualizada.");
    }
}
