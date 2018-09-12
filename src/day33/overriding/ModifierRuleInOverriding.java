package day33.overriding;

class P
{
	public void m1()
	{
		System.out.println("m1() of P");
	}
}

class C extends P{
	
	public void m1()
	{
		System.out.println("m1() of C");
	}
}

public class ModifierRuleInOverriding {

	public static void main(String[] args) {
		P pp = new C();
		pp.m1();
	}
	
}
