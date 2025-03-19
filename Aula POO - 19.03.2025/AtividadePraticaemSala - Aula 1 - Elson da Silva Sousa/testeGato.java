package AtividadePraticaemSala;

class Gato { //passo 1 declarar a classe
   String nome; //passo 2 declarar os atributos
   int qtdComidaDisponivel;  //passo 2 declarar os atributos
   boolean sono;  //passo 2 declarar os atributos
    int qtdInseto;

    void dormir() { //passo 3: declarar os metodos
       if (sono){
           sono = false;
           System.out.println(nome + " dormiu");
       }
       else{
           System.out.println(nome + " nao está com sono");
       }
    }

    void comer() { //paso 3: declarar os metodos
        qtdComidaDisponivel-=1;
        System.out.println(nome + " Comeu. Comida restante: " + qtdComidaDisponivel);
    }
    void cacar(int qtdInseto){
        if(sono){
            qtdInseto+=0;
            sono = true;
        }
        else{
            qtdInseto+=1;
            sono = false;
            System.out.println(nome + " caçou " + qtdInseto +" Insetos(s) para seu dono! ");
        }
    }

}
public class testeGato{
    public static void main(String[] args) {
               Gato gato1 = new Gato();
               gato1.nome = "Sushi";
               gato1.qtdComidaDisponivel = 3;
               gato1.sono = true; //significa que o sushi esta com sono
               gato1.comer();
               gato1.dormir();
               gato1.cacar(0);
               Gato gato2 = new Gato();
               gato2.nome = "Cachaça";
               gato2.qtdComidaDisponivel = 3;
               gato2.sono = false;
               gato2.comer();
               gato2.dormir();
               gato2.cacar(5);//passagem por argumento

    }
}