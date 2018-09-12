package day26.accessmodifiers;

import day25.accessmodifiers.Class1;

public class Class4 extends Class1 {

	String varclass4;
	
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		
		// Public variables and methods are accessible anywhere.
		System.out.println(c1.varclass1);
		c1.publicdMethod();
		
		// Can't use default variables and methods outside the package
		//System.out.println(c1.defaultVarClass1);
		//c1.defaultMethod();
		
		//System.out.println(protectedVatClass1);
		
		Class4 c4 = new Class4();
		System.out.println(c4.protectedVarClass1);
		c4.protectedMethod();
		//c4.protectedMethod();
		
	}
}
