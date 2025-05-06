package devdojoaula38array;

public class AulaArray {
    public static void main(String[] args) {
        int[] idade = {10, 20, 30};
        int[] idade2 = new int[3];
        for (int i = 0; i < idade.length; i++) {
            System.out.println("Idade[" + i + "]: " + idade[i]);
        }
        System.out.println("\n");
        for(int num: idade){
            System.out.println(num);
        }
        System.out.println("\n");
        for(int j = 0; j<idade.length; j++){
            System.out.println("Idade[" + j + "]: " + idade[j]);
        }
        System.out.println("\n");
        for(int k = 0; k<idade2.length; k++){
            idade2[k] = k + 10;
        }
        for(int l: idade2){
            System.out.println(l);
        }

    }
}
