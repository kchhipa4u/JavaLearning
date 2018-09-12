package day55.collectionframework.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

// class  Comparable{
   // public int compareTo(Object obj) {   }
//}
 

//    class  implements interface
//  TreeSet t = new TreeSet(Comporator c);

// MyComparator com = new MyComparator();
//   TreeSet t = new TreeSet(com)

// TreeSet t = new TreeSet(new MyComparator())
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		
		//return - i2.compareTo(i1);   /// i.compreTo(i2)
		
		return -1;
	
	}
	
}

class TreeSetDemo3 {

   public static void main(String[] a){
	   
       TreeSet t = new TreeSet(new MyComparator());
	   t.add(10);
	   t.add(0);
	   t.add(15);
	   t.add(5);
	   t.add(20);
	   t.add(20);
	   
	   System.out.println(t); //[0, 5, 10, 15, 20]
   }
}