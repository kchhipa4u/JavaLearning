package day41.instancecontrolflow;

public class Parent1 {
	
	int i = 10;
	
	{
		m1();
		System.out.println("Parent Instance Block");
	}

	Parent1(){
		System.out.println("Parent Constructor");
	}
	
	public void m1() {
		System.out.println(j);
	}
	
	int j = 20;
}
