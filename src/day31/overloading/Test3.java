package day31.overloading;

class Test3 {
	
	public void m1(int i, float f) {
		System.out.println("int-float argument");
	}

	public void m1(float f, int i) {
		System.out.println("float-int argument");
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.m1(10, 15.5f);
		t.m1(15.5f, 10);
		
		//t.m1(25.5f, 35.6f);
		
		//t.m1(10, 30);
	}
}