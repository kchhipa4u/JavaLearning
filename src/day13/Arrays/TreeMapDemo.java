package day13.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TreeMapDemo {

	public static void main(String[] args) {
		 Map<String,String> hm=new HashMap<String,String>();  
		  hm.put("66105","Amit");  
		  hm.put("610","Ravi");  
		  hm.put("66478","Vijay");  
		  hm.put("103","Rahul");
		  hm.put("106","AAA");
		  hm.put("107","BBB");
		  hm.put("102","CCC");
		  hm.put("112","DDD");
		  for(int i=1; i<=100000; i++)
		  {
			  hm.put("100"+i, "i"+i);
		  }
		 // System.out.println(hm);
		  
		  StringBuilder sb = new StringBuilder("10010000");
		  sb.insert(0, "370");
		  
		  for(int x=sb.length()-1; x > 0; x--)
		  {
			  if(hm.get(sb) == null)
			  {
				  sb.deleteCharAt(x) ;
				  continue;
			  }
			  
			  
		  }
		  
		  System.out.println(sb.deleteCharAt(sb.length()-1));
		  
		  //Collections.binarySearch(hm.keySet(), "66105");
		  long start = System.nanoTime();
		  System.out.println(hm.get("100100000"));
		  long end = System.nanoTime();
	      System.out.println("Time taken(s): " + (end - start)/1.0e9);
	}
}
