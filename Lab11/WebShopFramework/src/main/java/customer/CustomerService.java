package customer;

public class CustomerService {

    CustomerDAO customerDAO = new CustomerDAO();

    public Customer findCustomer(int customer_id){
        return customerDAO.find(customer_id);
    }

    public void addCustomer(int customer_id, String name, String email, String phone){
        Customer customer = new Customer(customer_id, name, email, phone);
        customerDAO.save(customer);
    }

    public void removeCustomer(int customer_id){
        customerDAO.delete(customer_id);
    }
}
