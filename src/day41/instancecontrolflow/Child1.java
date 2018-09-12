package day41.instancecontrolflow;

public class Child1 extends Parent1 {

	int x = 100;
	
	{
		m2();
		System.out.println("Child Instance Block");
	}
	
	Child1(){
		System.out.println("Child Constructor");
	}
	
	public static void main(String[] args) {
		Child1 c = new Child1();
		System.out.println("Child main");
	}
	
	public void m2() {
		System.out.println(y);
	}
	
	{
		System.out.println("Child Second INstance Block");
	}
	
	int y = 200;

}
