import com.product.P1;

public class Calculate {
	
	public static void main(String[] args) {
		String firstName = args[0];
		
		String lastName = args[1];
		
		System.out.println("My name is:" + firstName + " " + lastName);
		
		P1 product1 = new P1();
		
		System.out.println(product1.name);
	}
}
