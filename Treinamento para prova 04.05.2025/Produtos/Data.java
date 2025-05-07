package Produtos;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean validar() {
        if (ano > 1900 || ano < 2100) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > 31) {
            return false;
        }
        return true;
    }

    public boolean validade(Data data) {
        if (ano < data.ano) {
            return true;
        }
        if (ano == data.ano && mes < data.mes) {
            return true;
        }
        if (ano == data.ano && mes == data.mes && dia < data.dia) {
            return true;
        }
        return false;
    }
}

