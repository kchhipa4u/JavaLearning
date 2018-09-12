package day53.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Product> products = new ArrayList<Product>();
	
	public void addToCart(Product p) {
		products.add(p);
	}
	
	public void displayProducts() {
		for(Product p : products) {
			System.out.println(p);
		}
	}
	
	public static void main(String[] args) {
		Product p1 = new Product("SCJP", 500);
		Product p2 = new Product("Book2", 1000);
		Product p3 = new Product("Shirt", 1500);
		
		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(p1);
		cart.addToCart(p2);
		cart.addToCart(p3);
		
		cart.displayProducts();
	}
}
