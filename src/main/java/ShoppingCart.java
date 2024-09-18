import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList <Item> itens;

    public ShoppingCart() {
        this.itens = new ArrayList<>();
    }

    public void addItem(Item item){
        this.itens.add(item);
    }

    public int getItemCount() {
        return this.itens.size();
    }

    public double calculateTotal(){

        return  this.itens.stream().mapToDouble(Item ::getPreco).sum();
    }


}
