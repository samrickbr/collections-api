package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionaritens(String item){
        itemList.add(new Item(item));
    }

    public void removerItem(String item) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i: itemList) {
            if(i.getItem().equalsIgnoreCase(item)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public int obtemNumeroTotalItens(){
        return itemList.size();
    }

    public void obterItensCarrinho(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("O número total de itens no carrinho é: " + carrinho.obtemNumeroTotalItens());

        carrinho.adicionaritens("Item 1");
        carrinho.adicionaritens("Item 1");
        carrinho.adicionaritens("item 2");

        System.out.println("O número total de itens no carrinho é: " + carrinho.obtemNumeroTotalItens());

        carrinho.removerItem("Item 1");

        System.out.println("O número total de itens no carrinho é: " + carrinho.obtemNumeroTotalItens());

        carrinho.obterItensCarrinho();

    }
}
