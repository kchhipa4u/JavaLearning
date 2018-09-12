package day43.ExceptionHandling;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		
		}catch (Exception e) {
			System.out.println("I am in catch block");
		}
		finally {
			System.out.println("I am at finally block");
		}
	}
}
