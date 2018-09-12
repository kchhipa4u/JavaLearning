package day14.Arrays;

public class InterestingArrayExamples {

	public static void main(String[] args) {
		
	// Q1 -: Which assignment is correct
		int[] a = {10, 20, 30, 40};
		int[] b = {50, 60};

		b = a;
		a = b;
	
	// Q2 -:
		  int[][] x = new int[3][];
		//x[0] = new int[4][3];  // CTE
		 // x[0] = 20;         // CTE
		  x[0] = new int[4];
	}
}
