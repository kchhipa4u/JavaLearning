package day25.accessmodifiers;

public class Class2 {

	String varclass2;
	
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		
		System.out.println(c1.varclass1);
		c1.publicdMethod();
		
		System.out.println(c1.defaultVarClass1);
		c1.defaultMethod();
		
		System.out.println(c1.protectedVarClass1);
		c1.protectedMethod();
		
		// Can be used within a class only
		//System.out.println(c1.privateVarClass1);
		//c1.privateMethod();
		
		
	}
}
