package day31.overloading;

class Test2 {
	
	public void m1(String s) {
		System.out.println("String argument");
	}

	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer argument");
	}

	public static void main(String[] args) {
		Test2 t = new Test2();

		t.m1("Kanhaiya");
		t.m1(new StringBuffer());
		//t.m1(null);
	}
}