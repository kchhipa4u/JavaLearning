package day53.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class PositionalOperationList {

	public static void main(String[] args) {
		/*List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		
		//lst.remove(2);
		lst.remove(new Integer(2));
		
		System.out.println(lst);*/
				
		
		List<String> lst = new ArrayList<>();
		
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("E");
		
		List<String> lst1 = new ArrayList<>();
		lst1.add("X");
		lst1.add("Y");
		lst1.add("Z");
		lst1.add("A");
		
		//lst.addAll(lst1);
		//System.out.println(lst);
		
		lst.addAll(2, lst1); // A, B, X,Y, Z, A, C, D, E
		System.out.println(lst);
		
		
	}
}
