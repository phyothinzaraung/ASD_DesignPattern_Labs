package shopping_cart;

import cart_item.CartItem;
import product.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    private int cartId;

    private List<CartItem> cartList = new LinkedList<>();

    private double total_price = 0;

    public ShoppingCart(int cartId){
        this.cartId = cartId;
    }

    public void addToCart(Product product, int quantity){
        boolean found = false;

        Iterator<CartItem> iterator = cartList.iterator();
        while (iterator.hasNext()){
            CartItem item = iterator.next();
            Product prod = item.getProduct();
            if(prod.getId() == prod.getId()){
                item.setQuantity(item.getQuantity() + quantity);
                found = true;
                break;
            }
        }
        if(!found){
            cartList.add(new CartItem(product, quantity));
        }
        computeTotalPrice();
    }

    private void computeTotalPrice() {
        total_price = 0;
        Iterator<CartItem> iterator = cartList.iterator();
        while (iterator.hasNext()){
            CartItem item = iterator.next();
            total_price = total_price + (item.getQuantity() * item.getProduct().getPrice());
        }
    }

    public void removeFromCart(int product_id, int quantity){
        Iterator<CartItem> iterator = cartList.iterator();
        while (iterator.hasNext()){
            CartItem cartItem = iterator.next();
            Product product = cartItem.getProduct();
            if(product.getId() == product_id){
                if(cartItem.getQuantity() <= quantity){
                    iterator.remove();
                    computeTotalPrice();
                    break;
                }else {
                    cartItem.setQuantity(cartItem.getQuantity() - quantity);
                }
            }
        }
    }

    public void updateQuantity(int product_id, int quantity){
        Iterator<CartItem> iterator = cartList.iterator();
        while (iterator.hasNext()){
            CartItem cartItem = iterator.next();
            Product product = cartItem.getProduct();
            if(product.getId() == product_id){
                cartItem.setQuantity(quantity);
            }
        }
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<CartItem> getCartList() {
        return cartList;
    }

    public void setCartList(List<CartItem> cartList) {
        this.cartList = cartList;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartId=" + cartId +
                ", cartList=" + cartList +
                ", total_price=" + total_price +
                '}';
    }
}
