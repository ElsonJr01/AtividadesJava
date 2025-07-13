public class Aula07parte03 {
    public static void main(String[] args) {

        int[] numeros2 = {1,2,3,4,5,6,7,8,9};

        for(int i=0; i< numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        int num = 0;
        for(int nome: numeros2){
            System.out.println(nome);
        }
        System.out.println("Acabou");
    }
}
