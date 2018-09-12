package day15.scopeofVariables;

public class Test {

	static int x = 10;  // can be accessed in static and non-static areas both
	
	int y = 20;  // can be accessed in static area only. If we want to access it in non-static area then we have to creat object first.
	
	public static void main(String[] args) {
		System.out.println(x);
		Test t1 = new Test();
		t1.m1();
		
		System.out.println(t1.y);
	}
	
	public void m1(){
		System.out.println(x);
		System.out.println(y);
	}
}
