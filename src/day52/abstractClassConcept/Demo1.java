package day52.abstractClassConcept;

/**
 * @author kanhaiya.chhipa
 * 
 * Abstract Class = Interface + class
 * 
 * Rule3:- Abstract class may have all concrete methods only
 * Rule4:- Abstract class may have all abstract methods only
 * Rule5:- We can't create instance/object of abstract class same like interface
 * Rule6:- Abstract class must be sub-classed if you want to use it
 * 
 * Rule7:- If a class have one or more abstract method then class must be abstract class, but Abstract class may 
 *         not have single abstract method.
 * 
 * Rule8:- abstract class can have constructor..
 *
 */
public abstract class Demo1 {

	public void m1() {
		System.out.println("method m1");
	}
	
	public void m2() {
		System.out.println("method m2");
	}
	
	public void m3() {
		System.out.println("method m3");
	}
	
	public static void main(String[] args) {
		System.out.println("AAAAA");
	}

	public Demo1() {}
	
	/*public abstract void m4();
	
	public abstract void m5();
	
	public abstract void m6();*/
}
