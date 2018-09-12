package day43.ExceptionHandling;

public class PrintException {

	public static void main(String[] args) {
		
		
		try {
			//System.out.println(args[0]);
			System.out.println(10 /0);
		} 
		
		catch (ArithmeticException e) {
			//e.printStackTrace(); // 1
			//System.out.println(e); // or System.out.println(e.toString()); // 2
			System.out.println(e.getMessage()); // 3
		}
		catch(Exception e) {
			System.out.println("Come here to resolve generic way");
		}
		
		System.out.println("At last");
	}
}