import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    private  ShoppingCart cart;

    @BeforeEach
    public void setUp(){
        cart = new ShoppingCart();
    }

    @Test
    public void testAddItem(){
        cart.addItem(new Item("Produto 1", 10.0));
        Assertions.assertEquals(1,cart.getItemCount());
    }
    @Test
    public void testCalculateTotal(){
        cart.addItem(new Item("Produto 1", 10.0));
        cart.addItem(new Item("Produto 2", 20.0));
        Assertions.assertEquals(30.0, cart.calculateTotal());

    }
}
