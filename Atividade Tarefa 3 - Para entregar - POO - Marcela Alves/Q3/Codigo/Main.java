package Q3;

public class Main {
    public static void main(String[] args) {
        Computador ram = new Computador("Samsung", "Full", "I90", 179, new PlacaMae("Samsung", "Intel", "DDR4"));
        ram.exibir();
        ram.atualizarCom("Samsung", "Full", "I90", 179, new PlacaMae("LG", "Intelij", "HRG#"));
        ram.exibir();
    }
}
