package day53.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakeALSynchronized {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		
		List<String> synchronizedList = Collections.synchronizedList(al);
		synchronizedList.size();
		synchronizedList.add("E");
		
	}
}
