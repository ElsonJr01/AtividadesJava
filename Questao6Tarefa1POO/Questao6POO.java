package Questao6Tarefa1POO;
import java.util.Scanner;

public class Questao6POO {
    public static void main(String[] args) {
        System.out.println("\nDigite a palavra: ");
        String palavra = new Scanner(System.in).nextLine();

        if(palavra.toLowerCase().contains("a")){
            System.out.println("A letra 'a' foi encontrada");
        }
        else {
            System.out.println("A letra 'a' não foi encontrada");
        }
    }
}