package day15.scopeofVariables;

public class InstanceVarDemo {

	int x;  // instance, primitive, default --> 0
	boolean b;  // instance, primitive,  default --> false
	String s;   // instance of some Object type, String is defined class in java
	
	public static void main(String[] args) {
		InstanceVarDemo obj1 = new InstanceVarDemo();
		System.out.println(obj1.x);
		System.out.println(obj1.b);
		System.out.println(obj1.s);
		
		InstanceVarDemo obj2 = new InstanceVarDemo();
		obj2.x = 10;
		obj2.b = true;
		obj2.s = "Abu";
		
		System.out.println(obj2.x);
		System.out.println(obj2.b);
		System.out.println(obj2.s);
		
	}
}
