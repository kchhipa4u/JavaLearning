package day54.collectionframework.list.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExternalIteratorDemo {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Kan");
		names.add("Abu");
		names.add("Neha");
		names.add("D");

		// Getting Iterator
		Iterator<String> namesIterator = names.iterator();

		// Traversing elements
		while (namesIterator.hasNext()) {
			//if(namesIterator.next().equals("Kan"))
			if(namesIterator.next() == "Kan")
			  //namesIterator.remove();  // RTE
			  System.out.println(namesIterator.next());
			  //names.add("E");
			  //names.remove(1);
		}
		
		names.add("E");
		
		System.out.println(names.size());

	}
}