package day35.overriding;

import java.util.List;

public class Product {

	// List<String> l = new ArrayList<>();
	// List<String> l = new LinkedList<>();
	// List<String> l = new Vector<>();
	// P p = new C();
	public void displayProductList(List<String> al) {
		for (String a : al) {
			System.out.println(a);
		}
	}
	
	/*public void displayProductListForLinkedList(LinkedList<String> al) {
		for (String a : al) {
			System.out.println(a);
		}
	}*/
}
