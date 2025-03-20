package QuestaoPOO;
public class Questao3POO {
    public static void main(String[] args) {
        int inteiro = 29;
        float ponto = 5.f;
        double resultado = inteiro * ponto;
        char letra = 'E';
        String texto = letra + "Strings trabalham com texto.";
        boolean amora = true;
        boolean abacaxi = false;

        System.out.println("Numero inteiro: " + inteiro);
        System.out.println("Numero ponto flutuante (Floate): " + ponto);
        System.out.println("Numero resultado da multiplicação entre um inteiro e um float que torna um Double: " + resultado);
        System.out.println("Char que é apenas um caracter: " + letra);
        System.out.print(texto);
        // Booleanos sao usados para verdadeiros ou falsos como em C
        System.out.println(amora);
        System.out.println(abacaxi);
    }
}
