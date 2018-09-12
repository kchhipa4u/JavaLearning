package day29.inheritance;

class A{
	
	public void m1() {
		System.out.println("metoh m1 in class A");
	}
}

class B extends A {
	
	
}

public class MultiLevelInheritance extends B{

	public static void main(String[] args) {
		MultiLevelInheritance obj = new MultiLevelInheritance();
		obj.m1();
	}
}
