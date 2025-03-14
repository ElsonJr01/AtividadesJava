import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 10");
        int numero = scanner.nextInt();
        if(numero >= 1 && numero <= 10){

       System.out.println("Tabuada do " + numero + ":");
       for (int j = 0; j <= 10; j++) {
           int resultado = numero * j;
           System.out.println(numero+ " X " +j+ " = " + (numero * j));
       }
System.out.println("---------------------------------------");

       for(int i = 1; i <= 10; i++){
           int resultado = numero + i;
           System.out.println(numero+ " + " +i+ " = " + (numero + i));

       }

         }
    }
}
