package day14.Arrays;

public class ArrayAssignmentDemo {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 100, 120, 180};
		int[] b = {50, 60, 70, 80, 90};
         System.out.println("Arrays lenght before assignment");
         System.out.println("a length: "+ a.length);
         System.out.println("b length: "+ b.length);
		//b = a;
		//a = b;
		int[] z;
		z = a;
		a = b;
		b = z;
		
		 System.out.println("Arrays lenght after assignment change");
		 System.out.println("a length: "+ a.length);
         System.out.println("b length: "+ b.length);
	}
}
