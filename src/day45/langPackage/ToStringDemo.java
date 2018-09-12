package day45.langPackage;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	String name;
}
public class ToStringDemo {

	public static void main(String[] args) {
		String s = "Kanhaiya";
		System.out.println(s);
		
		Integer i = new Integer(20);
		System.out.println(i);
		
		List<String> lst = new ArrayList<>();
		lst.add("A");
		lst.add("B");
		System.out.println(lst);
		
		Vehicle v = new Vehicle();
		v.name = "Maruti";
		
		System.out.println(v);
		System.out.println(v.name);
	}
}
