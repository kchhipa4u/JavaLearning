package day45.langPackage;

import java.lang.reflect.Method;

public class ClassMetadataDemo {

	public void m1() {
		System.out.println("abcd");
	}
	
	public void m2() {
		System.out.println("abcd");
	}
	
	public static void main(String[] args)
    {
        Object obj = new String("abcd");
        
        Class c = obj.getClass();
        
        System.out.println("Class of Object obj is : "
                           + c.getName());
        
       Object cmd = new ClassMetadataDemo();
       Class c1 = cmd.getClass();
       
       Method[] declaredMethods = c1.getDeclaredMethods();
       
       for (Method method : declaredMethods) {
		System.out.println(method.getName());
	}
       
        
    }
}
