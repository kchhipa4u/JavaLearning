package day54.collectionframework.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		/*List<String> lst = new ArrayList<>(5);
		lst.add("A");
		lst.add("B");
		lst.add("C");*/
		
		
		LinkedList<String> lst1 = new LinkedList<>();
		lst1.add("A");
		lst1.add("B");
		lst1.add("C");
		lst1.addFirst("Z");
		lst1.addLast("X");	
		
		System.out.println(lst1); // Z A B C X
	}
}
