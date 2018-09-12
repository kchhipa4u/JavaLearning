package day15.scopeofVariables;

public class StaticScopeDemo {

	 String name = "neha";
	
	public static void main(String[] args) {
		StaticScopeDemo obj1 = new StaticScopeDemo();
		System.out.println(obj1.name);
	}
}
