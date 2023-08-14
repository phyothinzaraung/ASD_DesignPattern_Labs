import product.Product;
import shopping_cart.ShoppingCart;
import shopping_cart.ShoppingCartService;

public class Application {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Java Book", 50);
        Product product2 = new Product(2, "C Sharp Book", 34);
        Product product3 = new Product(3, "React Book", 56);

        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.createCart(1);
        shoppingCartService.addToCart(1, product1,4);
        shoppingCartService.addToCart(1, product2,2);
        shoppingCartService.updateQuantity(1, 1,6);
        shoppingCartService.addToCart(1, product1,2);

        ShoppingCart cart = shoppingCartService.getCart(1);
        System.out.println(cart);

    }
}
