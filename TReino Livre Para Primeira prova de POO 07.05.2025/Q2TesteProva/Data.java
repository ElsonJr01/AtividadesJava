package Q2TesteProva;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

   public void setData(int dia, int mes, int ano) {
       this.dia = dia;
       this.mes = mes;
       this.ano = ano;
   }

   public String getData(){
       return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
