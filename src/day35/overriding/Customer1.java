package day35.overriding;

import java.util.ArrayList;

public class Customer1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("P1");
		al.add("P2");
		al.add("P3");
		Product p = new Product();
		
		p.displayProductList(al);
	}
}
