package day54.collectionframework.list.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCapacity {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
	    arrayList.add("1");
	    arrayList.add("2");
	    arrayList.add("3");
	    arrayList.add("4");
	    arrayList.add("5");
	    arrayList.add("1");
	    arrayList.add("2");
	    arrayList.add("3");
	    arrayList.add("4");
	    arrayList.add("5");
	   
	    arrayList.add("11");
	   
	    
	    List<String> synchronizedList = Collections.synchronizedList(arrayList);
	    
	}
}
