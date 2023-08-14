package products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    public void addProduct(int productNumber, String name, double price){
        productDAO.save(new Product(productNumber, name, price));
    }

    public Product getProduct(int productNumber){
        return productDAO.find(productNumber);
    }

    public void removeProduct(int productNumber){
        productDAO.remove(productNumber);
    }
}
