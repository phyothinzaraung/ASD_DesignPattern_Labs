public class Application {

    public static void main(String[] args) {
        Category category = new Category("Book");
        Product product1 = new Product("Java");
        Product product2 = new Product("Design Pattern");
        Product product3 = new Product("Javascript");
        category.addComponent(product1);
        category.addComponent(product2);
        category.addComponent(product3);
        category.print();
    }
}
