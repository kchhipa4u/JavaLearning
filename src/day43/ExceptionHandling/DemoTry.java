package day43.ExceptionHandling;

public class DemoTry {

	public static void main(String[] args) {

		int x = 0;
		
		try {
			System.out.println(args[0]);
			System.out.println(x);
		} 
		
		catch (Exception e) {
			System.out.println("Abu");
		}
		finally {
			System.out.println("I am at Finally...");
		}
	}
}
