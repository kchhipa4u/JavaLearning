package day30.inheritance;

class Parent11 {

	public void sum(int x, int y) {
		System.out.println("Addition is:" + (x + y));
	}
}

class Child11 extends Parent11 {
	
	public void sum(int x, int y, int z) {
		System.out.println("Addition is:" + (x + y + z));
	}
}

public class TestChild11{
	public static void main(String[] args) {
		Child11 c11 = new Child11();
		c11.sum(10, 20);
		c11.sum(10, 20, 30);
		
		Parent11 p11 = new Parent11();
		p11.sum(30, 40);  // Not an overloading case
		//p11.sum(10, 20, 30);  // This wont work
		
		
		Parent11 p12 = new Child11();
		p12.sum(40, 50);
		
	}
}