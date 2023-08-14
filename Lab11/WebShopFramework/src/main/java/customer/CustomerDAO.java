package customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerDAO {
    private Map<Integer, Customer> customers = new HashMap<>();

    public void save(Customer customer){
        customers.put(customer.getId(), customer);
    }

    public Customer find(int customer_id){
        return customers.get(customer_id);
    }

    public Map<Integer, Customer> findAllCustomers(){
        return customers;
    }

    public void update(int customer_id, Customer customer){
        customers.replace(customer_id, customer);
    }

    public void delete(int customer_id){
        customers.remove(customer_id);
    }
}
