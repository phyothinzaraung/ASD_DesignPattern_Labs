package order;

public class OrderService {

    private OrderDAO orderDAO = new OrderDAO();

    public Order findOrder(int orderNumber){
        return orderDAO.find(orderNumber);
    }
}
