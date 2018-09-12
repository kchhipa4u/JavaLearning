package day25.accessmodifiers;

public class Class3 {

	String varclass3;
	
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		System.out.println(c1.varclass1);
		c1.publicdMethod();
		
		System.out.println(c1.defaultVarClass1);
		c1.defaultMethod();
		
		System.out.println(c1.protectedVarClass1);
		
		
	}
}
