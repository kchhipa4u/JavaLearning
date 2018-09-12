package day43.ExceptionHandling;

public class StackOverflowDemo {

	public static void main(String[] args) {
		System.out.println("Execution starts here...");
		m1();
	}

	private static void m1() {
		m2();
		
	}

	private static void m2() {
		m1();
		
	}
}
