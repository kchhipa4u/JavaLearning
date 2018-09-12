package day43.ExceptionHandling;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InstanceOfDemo {

	public static void main(String[] args) {
		
		/*Integer i1 = new Integer(10);
		
		if(i1 instanceof Object) {
			System.out.println("Yes this is an Integer Object");
		}
		else {
			System.out.println("This is not integer Object");
		} */
		
		List asList = Arrays.asList(1, "ONE", 2, "TWO", 3, "THREE");
		
		Integer sum=0;
		for (Object object : asList) {
			if(object instanceof Integer) {
				sum= sum + (Integer)object;
			}
			else if(object instanceof String) {
				System.out.println("You can't add String Objec " + object);
			}
		}
		System.out.println("Total: "+ sum);
	}
}
