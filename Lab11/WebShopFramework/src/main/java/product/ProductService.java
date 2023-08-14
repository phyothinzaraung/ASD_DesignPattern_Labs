package product;

import java.util.Map;

public class ProductService {
    ProductDAO productDAO = new ProductDAO();

    public void addProduct(int product_id, String name, double price){
        Product product = new Product(product_id, name, price);
        productDAO.save(product);
    }

    public void removeProduct(int product_id){
        productDAO.delete(product_id);
    }

    public Map<Integer, Product> getProducts(){
        return productDAO.findAllProduct();
    }
}
