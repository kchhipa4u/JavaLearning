package day55.collectionframework.set.introducion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetIntroduction {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(175);
		s.add(220);
		s.add(10);
		s.add(6);
		System.out.println(s.add(2));  // true
		s.add(7);
		s.add(9);
		s.add(1);
		System.out.println(s.add(2));  // false
		s.add(977);
		s.add(null);
		
		
		System.out.println(s);
		
		System.out.println(s.contains(100));
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(70);  // 0
		l.add(20);  // 1
		l.add(30);  // 2
		
		l.add(1, 90);
		System.out.println(l); // 70, 90, 20, 30
		System.out.println(l.get(2)); // 20
		
	}
}
