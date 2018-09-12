package day53.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class FirstExample {

	public static void main(String[] args) {
		List lst = new ArrayList(); 
		lst.add(1);  //  primitive   ---autoboxing-------> Integer -> Object
		lst.add("A"); // String -> Object
		
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		//nums.add("A");
		
		
	}
}
