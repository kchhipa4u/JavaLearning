package day31.overloading;

class Test1 {
	
	public void m1(Object o) {
		System.out.println("Object argument");
	}
	
	public void m1(String s) {
		System.out.println("String argument");
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		
		t.m1("Abu");
		t.m1(new Object());
		
		t.m1(null);
	}
}