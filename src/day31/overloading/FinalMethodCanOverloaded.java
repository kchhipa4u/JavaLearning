package day31.overloading;

public class FinalMethodCanOverloaded {

	public final void m1(int x) {
		System.out.println("x is: "+ x);
	}
	
	public void m1(double y) {
		System.out.println("x is: "+ y);
	}
	
	public static void main(String[] args) {
		FinalMethodCanOverloaded a = new FinalMethodCanOverloaded();
		a.m1(10);
		a.m1(25.7);
		a.main(75);
		
	}
	
	public void main(int u) {
		System.out.println("u is: "+ u);
	}
}
