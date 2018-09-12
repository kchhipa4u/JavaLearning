package day31.overloading;

class Test4 {
	
	public void m1(int i) {
		System.out.println("general method");
	}

	// supported for zero or more argument
	// Java 1.5
	public void m1(int... i) {
		System.out.println("varargs method");
	}

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.m1();  // var-args supports zero or more arguments
		t.m1(20);
		t.m1(10,30);

	}
}