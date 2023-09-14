package list.OperacoesBasicas;

public class Item {
    //atributo

    private String item;

    public Item(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Item= '" + item + '\'';
    }
}
