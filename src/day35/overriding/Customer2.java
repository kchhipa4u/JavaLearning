package day35.overriding;

import java.util.LinkedList;

public class Customer2 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("p3");
		ll.add("p4");
		ll.add("p5");
		
		Product p  = new Product();
		p.displayProductList(ll);
	}
}
