package day33.overriding;

class PP
{
	public int m1()
	{
		System.out.println("m1() of PP");
		return 0;
	}
}

class CC extends PP{
	
	public int m1()
	{
		System.out.println("m1() of CC");
		return 0;
	}
}

public class REturnTypeRuleInOverriding {

	public static void main(String[] args) {
		PP p = new CC();
		p.m1();
	}
}
