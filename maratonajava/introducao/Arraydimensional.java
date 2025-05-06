package devdojoaula38array;

/**
 * Atuvidade feita com <b>Java</b> apenas um treino para decorrer da vida
 */
public class Arraydimensional {
    public static void main(String[] args) {
        int[][] idade = new int[2][3];
        int[][] idade2 = new int[2][3];
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};

        for (int[] ar : idade) {
            System.out.println("Array length: " + idade[0].length);
            System.out.println("------");
            for (int val : ar) {
                System.out.println(val);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int value : matriz[i]) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

