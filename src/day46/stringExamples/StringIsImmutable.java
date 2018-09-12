package day46.stringExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StringIsImmutable {

	public static void main(String[] args) {
	
	// Immutable Object
	 String s1 = new String("Hello");
	 s1.concat(" World");
	//System.out.println(s1.concat(" World"));
	System.out.println(s1);
	

  // Not an immutable object
	StringBuffer sb1 = new StringBuffer("Hi");
	sb1.append(" Friend");
	
	System.out.println(sb1);
	
	
	String s2 = new String("Hello");
	System.out.println(s1 == s2);
	System.out.println(s1.equals(s2));
	
	StringBuffer sb2 = new StringBuffer("Hi");
	System.out.println(sb1 == sb2);  // f
	System.out.println(sb1.equals(sb2));  // f
	
	List<Map<String, Boolean>> map = new ArrayList<>();
	
	}	
	
}
