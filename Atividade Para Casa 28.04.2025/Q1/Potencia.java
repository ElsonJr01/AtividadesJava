package Q1;

public class Potencia {
    public int inicial;
    public int quantidade;
    public Grafico saida;

    public Potencia(int inicial, int quantidade) {
        this.inicial = inicial;
        this.quantidade = quantidade;
    }
    void conecta (Grafico saida){
        this.saida = saida;
    }

    void apresenta (){
        if (saida != null){
            int v = inicial;
            for (int i = 1; i<= quantidade; i++){
                saida.plota(v);
                v *= 2;
            }
        }
    }
}
