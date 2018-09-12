package day35.overriding;

import java.util.ArrayList;
import java.util.List;

public class Test {

	String name;
	List<String> l = new ArrayList<>();
	
	public static void main(String[] args) {
		Test t = new Test();
		//System.out.println(t.name.length());
		
		System.out.println(t.l.size());
	}
}
