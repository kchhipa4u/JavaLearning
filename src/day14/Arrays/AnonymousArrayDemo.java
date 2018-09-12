package day14.Arrays;

public class AnonymousArrayDemo {

	public static void main(String[] args) {
		int[] x = new int[] { 5, 10, 15 };
		display(new int[] { 5, 10, 15 });
				
		
	}

	static void display(int[] x) {
		for (int i : x) {
			System.out.println(i);
		}
	}
}
