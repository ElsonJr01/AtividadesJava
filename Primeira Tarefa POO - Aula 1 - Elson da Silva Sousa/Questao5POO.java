package Questao5POOPrimeiraTarefa;
public class Questao5POO {
    public static void main(String[] args) {
        for (int i = -3; i <= 100; i++) {
          i = i+3;
          System.out.println(i);
        }
        System.out.println("############################################################");
        int y = -3;
        while (y <= 100){
            y = y+3;
            System.out.println(y);
        }
        System.out.println("############################################################");
        int w = -3;
        do{
            w = w+3;
            System.out.println(w);
        }while (w <= 100);
    }
}