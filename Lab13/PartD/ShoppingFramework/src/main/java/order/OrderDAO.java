package order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class OrderDAO {
    private Map<Integer, Order> orders = new HashMap<Integer, Order>();

    @Autowired
    public OrderDAO(){

    }

    public void save(Order order){
        orders.put(order.getOrdernumber(), order);
    }
    public Order find(int orderId){
        return orders.get(orderId);
    }
}
