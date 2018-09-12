package day14.Arrays;

public class SampleArrays {

	// int datatype is different than int[]
	static int[]   a[],b;
	static int[] c = new int[3];
	static byte[] d = new byte[3];        // [B
	static boolean[] e = new boolean[3];  // [Z
	static Integer[] i = new Integer[4];
	static int[][] arr = new int[3][];
	
	int[]   aa[], bb[];
	int[]    []aaa, bbb;
	//int[]    []aaaa, []bbbb;
	static int[] abb = new int[-3];
	
	public static void main(String[] args) {
		int int2dArray[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		   
		int[][] int2dArray1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		   
		int[] int2dArray2[] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		   
		int int2dArray3[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		
		int int2dArrayy[][] = new int[3][]; 
		int[] oneD = new int[3];
		
		//System.out.println(a);  // null
		//System.out.println(b);  // null
		
		//System.out.println(b.getClass().getName());
		
		//System.out.println(i.getClass().getName()); // [Z
		System.out.println(arr.getClass().getName());  // [[I
		// System.out.println(abb[0]);  //will throw NegativeArraySizeException
	}
}
