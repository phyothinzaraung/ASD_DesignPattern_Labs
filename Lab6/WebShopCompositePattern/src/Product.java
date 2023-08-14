public class Product extends WebShopComponent{
    public Product(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Product Name: " + name);
    }
}
