package order;

import java.util.HashMap;
import java.util.Map;

public class OrderDAO {

    private Map<Integer, Order> orders = new HashMap<>();

    public void save(Order order){
        orders.put(order.getOrderNumber(), order);
    }

    public void update(int orderNumber, Order order){
        orders.replace(orderNumber, order);
    }

    public Order find(int orderNumber){
        return orders.get(orderNumber);
    }

    public void delete(int orderNumber){
        orders.remove(orderNumber);
    }
}
