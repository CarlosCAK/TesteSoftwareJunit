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
        double soma = 0;

        for(Item item : this.itens){
            soma += item.getPreco();
        }
        return  soma;
    }


}
