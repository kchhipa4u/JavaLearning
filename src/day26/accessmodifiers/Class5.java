package day26.accessmodifiers;

import day25.accessmodifiers.Class1;

public class Class5 {

	String varclass5;
	
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		System.out.println(c1.varclass1);
		//System.out.println(c1.defaultVarClass1);
		//System.out.println(c1.protectedVatClass1);
		
		Class5 c5 = new Class5();
		//c5.
		c1.publicdMethod();
	}
}
