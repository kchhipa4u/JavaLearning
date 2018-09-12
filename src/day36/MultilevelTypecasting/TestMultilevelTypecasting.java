package day36.MultilevelTypecasting;

class A{
	
	public int x = 777;
	
	public  void m1() {
		System.out.println("A");
	}
}

class B extends A{
	public int x = 888;
	public  void m1() {
		System.out.println("B");
	}
}

class C extends B{
	
	public int x = 999;
	
	public  void m1() {
		System.out.println("C");
	}
}

public class TestMultilevelTypecasting {
	
	//B b = (B)c;  // B b = new C();
	
	//A a = (A)((B)c);  // A a = new C();
	
	public static void main(String[] args) {
		
		C c = new C();
		c.m1();
		System.out.println(c.x);
			     
	    B b = (B)c;
		b.m1();
		System.out.println(b.x);
		        
		A a = (A)b;
		a.m1();
		System.out.println(a.x);
		
		
		
		/*A a1 = (A)((B)c);
		a1.m1();
		
		((A)((B)c)).m1();*/
		//A a =(A)a (B)c;

			
		/*((B)c).m1();
		new C().m1();*/
	}
}
