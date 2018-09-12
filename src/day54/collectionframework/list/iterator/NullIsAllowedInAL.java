package day54.collectionframework.list.iterator;

import java.util.ArrayList;
import java.util.List;

public class NullIsAllowedInAL {

	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add("A");
		lst.add("B");
		lst.add(null);
		lst.add("C");
		lst.add(null);
		lst.add("A");
		System.out.println(lst);
	}
}
