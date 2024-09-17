import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<String> orders;

    public OrderService() {
        this.orders = new ArrayList<>();
    }
    public void addOrder(String order){
        this.orders.add(order);
    }
    public void removeOrder(String order){
        this.orders.remove(order);
    }
    public List<String> getAllOrders(){
        return this.orders;
    }
    public void clearAllOrders(){
        this.orders.clear();
    }

}
