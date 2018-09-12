package day55.collectionframework.set.treeset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// Interface        // Class
		Collection c = new ArrayList();
		c.add(25);
		c.add(6);
		c.add(2);
		c.add(73);
		c.add(8);
		
		System.out.println(c);
		
		TreeSet ts = new TreeSet(c);
		System.out.println(ts);
		
		System.out.println("=======================================================");
		
		// Interface        // Class
		SortedSet ss = new TreeSet();
		ss.add(20);
		ss.add(3);
		ss.add(17);
		
		TreeSet newObj = new TreeSet(ss);
		newObj.add(7);
		newObj.add(2);
		newObj.add(3);
		
		System.out.println(newObj); // output ?   [2 3 7 17 20]
		
	}
}
