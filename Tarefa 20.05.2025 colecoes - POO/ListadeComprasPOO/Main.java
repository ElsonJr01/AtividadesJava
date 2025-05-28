package ListadeComprasPOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            ListaDeCompras lista = new ListaDeCompras();
            InterfaceUsuario inter = new InterfaceUsuario(new Scanner(System.in), lista);
            inter.executar();
    }
}