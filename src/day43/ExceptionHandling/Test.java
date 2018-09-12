package day43.ExceptionHandling;

public class Test {

	public static void main(String[] args) {
		doStuf();
	}

	public static void doStuf() {
        doMoreStuff();		
	}

	public static void doMoreStuff() {
		try {
              System.out.println(10/0);	
              System.out.println("ABU");
              System.out.println("Neha");
		}
		catch(Exception e) {
			//System.out.println("I will handle this situation myself");
			e.printStackTrace();
		}
		
		System.out.println("Come Here");
		
		sum(50, 60);
	}

	private static void sum(int i, int j) {
		System.out.println("Sum is:" + (i+j));
	}
}
