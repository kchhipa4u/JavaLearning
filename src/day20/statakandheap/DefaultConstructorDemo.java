package day20.statakandheap;

public class DefaultConstructorDemo {

	int x;
	String s;
	
	// If we do not specify our own constructor then JVM provide us default constructor
	DefaultConstructorDemo(){
		this.x = x;
		this.s = s;
	}
	
	public DefaultConstructorDemo(int x, String s) {
		this.x = x;
		this.s = s;
	}
	
	public static void main(String[] args) {
		
		DefaultConstructorDemo c1 = new DefaultConstructorDemo();
		System.out.println(c1.x);
		System.out.println(c1.s);
	}

	
}
