package day45.langPackage;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException  {
		
		Class c = Class.forName("java.lang.Object");
		
		Method[] m = c.getDeclaredMethods();
		
		int count = 0;
		for (Method method : m) {
			System.out.println(method.getName());
			count++;
		}
		System.out.println();
		System.out.println("Total methods in Object: " + count);
	}
}
