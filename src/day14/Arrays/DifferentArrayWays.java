package day14.Arrays;

public class DifferentArrayWays {
	
	public static void main(String[] args) {
		
		/*int[] marks;  // Declare an int array named marks
        // marks contains a special value called null.
        //int marks[];  // Same as above, but the above syntax recommended
		marks = new int[5];   // Allocate 5 elements via the "new" operator
		//Declare and allocate a 20-element array in one statement via "new" operator
		int[] factors = new int[20];
		//Declare, allocate a 6-element array thru initialization
		int[] numbers = {11, 22, 33, 44, 55, 66}; // size of array deduced from the number of items
*/		
		
		
		
		//Defined and initialized at same time
		int[] numbers = {10, 15, 25, 8, 35, 40, 15};
		
		// ArrayList - Dynamic  90%
		// Collection
		//System.out.println("My Numbers are: " +numbers);
		
		for(int x=0; x <numbers.length; x++)
		{
			if(x==2){
				break;
			}
		    System.out.println("Normal For Loop : " +numbers[x]);
		}
		
		// For Each Loop / Advance For Loop
		
		for (int i : numbers) {
			System.out.println(i);
		}
		
		// Indexing  -> 0, 1, 2, 3...... n-1
		// Defined
		int[] items = new int[8];
		
		
		System.out.println(items[0]);
		items[0] = 23;
		System.out.println(items[0]);
		// ArrayIndexOutOfBound
		System.out.println(items[7]);
		
		int size =items.length;
		System.out.println("Size is : " + size);
		
		/*items[0] = 23;
		items[1] = 33;
		
		System.out.println(numbers[3]);
		numbers[3] = 70;
		System.out.println(numbers[3]);
		
		
		System.out.println(items[7]);*/
	}

}
