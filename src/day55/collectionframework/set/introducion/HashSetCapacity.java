package day55.collectionframework.set.introducion;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetCapacity {

	public static void main(String[] args) {
		Set<Integer> hs = new LinkedHashSet<>();
		hs.add(62);
		hs.add(10);
		hs.add(32);
		hs.add(21);
		hs.add(4);
		hs.add(5);
		hs.add(5);
		
		System.out.println(hs);
		
		/*hs.add(6);
		hs.add(7);
		hs.add(8);
		hs.add(9);
		hs.add(10);
		hs.add(11);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		hs.add(16);*/
		
		/*int sum = 0;
		for (Integer integer : hs) {
			sum = sum + integer;
		}
		
		
		System.out.println(sum);*/
		
		/*for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}*/
		//System.out.println(hs);
		//System.out.println(hs.size());
		
		/*List<Integer> lst = new ArrayList<>();
		lst.add(4);
		lst.add(5);
		lst.add(7);
		
		System.out.println(lst.indexOf(7));
		
		System.out.println(lst);*/
		
		
		/*HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "A");
		hm.put(2, "B");*/
	}
}
