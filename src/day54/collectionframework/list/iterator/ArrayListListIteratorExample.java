package day54.collectionframework.list.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListListIteratorExample {

	public static void main(String[] args) {
		
		// Create an ArrayList and populate it with elements
	    ArrayList<String> arrayList = new ArrayList<>();
	    arrayList.add("element_1");
	    arrayList.add("element_2");
	    arrayList.add("element_3");
	    arrayList.add("element_4");
	    arrayList.add("element_5");
	    
	 // The ListIterator object is obtained using listIterator() method
	    ListIterator<String> it = arrayList.listIterator();
	    
	/* // For forward iteration over the collection elements we can use hasNext() and next() methods of ListIterator
	    System.out.println("Forward iteration :");
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	   
	 // For backward iteration over the collection elements we can use hasPrevious() and previous() methods of ListIterator
	    System.out.println("Backward iteration :");
	    while(it.hasPrevious()) {
	    	System.out.println(it.previous());
	    }*/
	    
	 /*// nextIndex and previousIndex return next and previous index from the current 
	    //position in the list
	    System.out.println("Previous Index is : " + it.previousIndex());   
	    System.out.println("Next Index is : " + it.nextIndex());*/
	    
	 // Add an element just before the next element
	    
	    System.out.println("After inserting element_6, ArrayList contains : ");
	    int cnt = 1;
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    	
	    	if(cnt == arrayList.size()) {
	    		it.add("element_6");
	    	}
	    	cnt++;
	    }
	    
	    
	    System.out.println(arrayList);
	}
}
