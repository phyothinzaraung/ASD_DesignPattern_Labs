package application;

import order.*;
import products.*;
import shopping.*;

public class Application {

	public static void main(String[] args) {
		ProductService productService = new ProductService();
		productService.addProduct(123,"Product1",25.50);
		productService.addProduct(124,"Product2",20.50);
		productService.addProduct(125,"Product3",13.75);
		
		Product product1 = productService.getProduct(123);
		Product product2 = productService.getProduct(124);
		ShoppingService shoppingService = new ShoppingService();
		shoppingService.createCart(1);
		shoppingService.addToCart(1, product1,4);
		shoppingService.addToCart(1, product2,2);
		shoppingService.changeQuantity(1,124,5);

		ShoppingCart cart = shoppingService.getCart(1);
		System.out.println(cart);

		OrderService orderService = new OrderService();
		orderService.createOrder(cart, 1);

		Order order= orderService.getOrder(1);
//		order.setOrdernumber("ORD3429");
		order.setCustomer(new Customer ("Frank Brown","fbrown@acme.com","465-234-9080"));
		order.setBillingAddress(new InternationalAddress("Mainstreet 1", "New Dehli", "", "India"));
		order.setShippingAddress(new InternationalAddress("Mainstreet 3", "New Dehli", "", "India"));
		Payment payment = new Payment(300.00, "12/07/2023");
		payment.setPaymentType(new PayPalPayment("fbrown@acme.com"));
		order.setPayment(payment);
		orderService.saveOrder(order);

		System.out.println(order);

		orderService.placeOrder(1);


	}

}
