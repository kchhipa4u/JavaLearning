package day53.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class SearchOperationInList {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();

		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("A");
		lst.add("E");
		
		System.out.println(lst.indexOf("C")); // 2
		System.out.println(lst.lastIndexOf("A")); // 4
		
	}
}
