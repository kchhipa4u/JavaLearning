package day35.overriding;

class P {
	final int x = 55;
	
	public void m1() {
		System.out.println("Parent");
	}
}

class C extends P {
	static int x = 66;
	public void m1() {
		System.out.println("Child");
	}
}

public class OverridingForVariables {
	public static void main(String[] a) {
		P p = new P();
		System.out.println(p.x);
		//p.m1();

		C c = new C();
		System.out.println(c.x);
		//c.m1();

		P pp = new C();
		System.out.println(pp.x);
		//pp.m1();
	}
}