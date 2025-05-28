package ListadeComprasPOO;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<String> itens;

    public ListaDeCompras() {
        this.itens = new ArrayList<String>();
    }
    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println("Item " + item + " adicionado com sucesso!");
    }
    public void removerItem(String item) {
        if (item != item) {
            System.out.println("Item não encontrado na lista!");
        } else {
            itens.remove(item);
            System.out.println("Item " + item + " removido com sucesso!");
        }
    }
    public void exibirItens() {
        System.out.println("Lista de compras: ");
        if (itens == null){
            System.out.println("Lista de compras vazia!");
        }
        int i = 0;
        for (String item : itens) {
            System.out.println(i++ + "Item: " + item);
        }
    }
    public boolean contemItem(String item){
        if (itens.contains(item)){
            System.out.println("Item " + item + " encontrado!");
            return true;
        }
        else {
            System.out.println("Item: " + item + "Nao encontrado!");
            return false;
        }
    }
    public void limparLista() {
        itens.clear();
        System.out.println("Lista limpa com sucesso!");
    }
}
