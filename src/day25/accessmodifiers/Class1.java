package day25.accessmodifiers;

public class Class1 {

	public String varclass1 ="Class 1 variable";
	
	String defaultVarClass1 ="Class 1 default variable";
	
	private String privateVarClass1 = "Class 1 priavte variable";
	
	protected String protectedVarClass1 = "Class 1 protected variable";
	
	public void publicdMethod() {
		System.out.println("I am public method of class 1");
	}
	
	void defaultMethod() {
		System.out.println("I am default method of class 1");
	}
	
	private void privateMethod() {
		System.out.println("I am private method of class 1");
	}
	
	protected void protectedMethod() {
		System.out.println("I am protected method of class 1");
	}
	
	public Class1() {}
	
	public static void main(String[] args) {
		
		Class1 c1 = new Class1();
		System.out.println(c1.privateVarClass1);
		System.out.println(c1.protectedVarClass1);
		// ALT + SHIFT + R   ---> Used for renaming
		
		c1.publicdMethod();
		c1.defaultMethod();
		c1.privateMethod();
	}
}
