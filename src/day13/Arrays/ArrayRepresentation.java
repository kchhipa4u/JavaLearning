package day13.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayRepresentation {

	// Declaration of array
	// When an array is declared but not allocated, it contains a special value called null.
	//static int[] marks;
	static int marks[]= new int[5];
	
	static int[] numbers = {10, 20, 30, 40};
	
	static int x = 5;
	public static void main(String[] args) {
		//System.out.println(marks);
		//System.out.println(x);
		//System.out.println(marks.length);
		
		marks[0] = 100;		
		marks[1] = 200;
		
		int j = 100;
		
		for(int x=0; x < marks.length; ++x)
		{
			marks[x]= j;
			j = j + 100;
		}
		
		for(int x=0; x < marks.length; ++x)
		{
			System.out.println(marks[x]);
		}
		
	}
	
	
    public void storeArrayVal(int x)
    {
    	int[] nums = new int[5];
    	nums[0] = x;
    	
    	Map<String, Object>[] maps = new HashMap[5];
    }

}
