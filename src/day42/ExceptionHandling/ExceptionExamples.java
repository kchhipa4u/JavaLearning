package day42.ExceptionHandling;

public class ExceptionExamples {

	public static void main(String[] args) {
		ExceptionExamples ee = new ExceptionExamples();
		ee.m1();
	}
	
	public  void m1() {
		System.out.println("Method m1...");
		m1();
	}
}
