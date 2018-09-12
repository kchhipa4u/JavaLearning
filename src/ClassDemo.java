
public class ClassDemo {

	int firstDigit;
	
	int secondDigit;
	
	public int add(int x, int y)
	{
		return x+y;
	}
	
	public ClassDemo() {
		System.out.println("My Constructor");
	}

	{
		System.out.println("Instance Initializer Block");
	}
	
	static{
		System.out.println("Static Initializer Block");
	}


	public static void main(String[] args) {
		
	}
}
