import java.util.ArrayList;
import java.util.Collection;

public class Category extends WebShopComponent{

    protected Collection<WebShopComponent> productCollection = new ArrayList<>();

    public Category(String name) {
        super(name);
    }

    public void addComponent(WebShopComponent product){
        productCollection.add(product);
    }

    @Override
    public void print() {
        System.out.println("Category Name: " + name);
        for(WebShopComponent component: productCollection){
            component.print();
        }
    }
}
