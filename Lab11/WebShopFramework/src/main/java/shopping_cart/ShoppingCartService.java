package shopping_cart;

import product.Product;

public class ShoppingCartService {

    ShoppingCartDAO shoppingCartDAO = new ShoppingCartDAO();

    public ShoppingCart getCart(int cartId){
        return shoppingCartDAO.find(cartId);
    }

    public void createCart(int cartId){
        ShoppingCart cart = new ShoppingCart(cartId);
        shoppingCartDAO.save(cart);
    }

    public void addToCart(int cartId, Product product, int quantity){
        ShoppingCart shoppingCart = getCart(cartId);
        shoppingCart.addToCart(product, quantity);
        shoppingCartDAO.save(shoppingCart);
    }

    public void removeFromCart(int cartId, int productId, int quantity){
        ShoppingCart shoppingCart = getCart(cartId);
        shoppingCart.removeFromCart(productId, quantity);
        shoppingCartDAO.save(shoppingCart);
    }

    public void updateQuantity(int cartId, int productId, int quantity){
        ShoppingCart shoppingCart = getCart(cartId);
        shoppingCart.updateQuantity(productId, quantity);
        shoppingCartDAO.save(shoppingCart);
    }
}
