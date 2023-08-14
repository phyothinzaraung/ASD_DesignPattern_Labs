package product;


import java.util.HashMap;
import java.util.Map;

public class ProductDAO {

    private Map<Integer, Product> products = new HashMap<>();

    public void save(Product product){
        products.put(product.getId(), product);
    }

    public Product find(int product_id){
        return products.get(product_id);
    }

    public Map<Integer, Product> findAllProduct(){
        return  products;
    }

    public Product update(int product_id, Product product){
        return products.replace(product_id, product);
    }

    public void delete(int product_id){
        products.remove(product_id);
    }
}
