package Q2TesteProva;

public class TestaData {
    public static void main(String[] args) {
        Data aniversario = new Data(1, 1, 2000);
        aniversario.setData(1, 1, 2000);
        System.out.println(aniversario.getData());
        aniversario.setData(26, 2, 7601);
        System.out.println(aniversario.getData());
    }
}
