import java.util.Scanner;
import java.lang.Math;
/**
 * Calculadora <b>Calculadora questao 3 </b>
 */
public class Questao3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro numero:");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo numero:");
            int num2 = scanner.nextInt();
            System.out.println("Digite o operador (+, -, *, /):");
            char operacao = scanner.next().charAt(0);

            int resultado;
            System.out.println("---------------------------------------");

            if (operacao == '+') {
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
            } else if (operacao == '-') {
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
            } else if (operacao == '*') {
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
            } else if (operacao == '/') {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            }
            else{
                System.out.println("Operacao invalida!");
            }
        }
    }
}
