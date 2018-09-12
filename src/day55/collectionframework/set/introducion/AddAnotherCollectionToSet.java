package day55.collectionframework.set.introducion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AddAnotherCollectionToSet {

	public static void main(String[] args) {
		
		Collection<Integer> c = new ArrayList<Integer>();
		c.add(5);
		c.add(6);
		c.add(7);
		c.add(5);
		
		System.out.println(c);
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		//s.addAll(c);
		s.retainAll(c);
		
		System.out.println(s); // o/p ?
	}
}
