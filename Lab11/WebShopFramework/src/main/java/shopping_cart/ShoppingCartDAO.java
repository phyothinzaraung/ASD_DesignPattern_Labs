package shopping_cart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartDAO {

    private Map<Integer, ShoppingCart> shoppingCarts = new HashMap<>();

    public void save(ShoppingCart shoppingCart){
        shoppingCarts.put(shoppingCart.getCartId(), shoppingCart);
    }

    public ShoppingCart find(int shoppingCartId){
        return shoppingCarts.get(shoppingCartId);
    }

    public Map<Integer, ShoppingCart> getAllShoppingCarts(){
        return  shoppingCarts;
    }

    public ShoppingCart update(int cartId, ShoppingCart shoppingCart){
        return shoppingCarts.replace(cartId, shoppingCart);
    }

    public ShoppingCart delete(int shoppingCartId){
        return shoppingCarts.remove(shoppingCarts);
    }

}
