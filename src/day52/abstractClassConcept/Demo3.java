package day52.abstractClassConcept;


/**
 * @author kanhaiya.chhipa
 *
 * Abstract class can have private, final, abstract, static and instance methods.
 *    Method cannot be private and abstract.
 *    Method cannot be final and abstract.
 */
public abstract class Demo3 {

	private void m1() {
		System.out.println("m1 method");
	}
	
	public final void m2() {
		System.out.println("m2 method");
	}
	
	public abstract void m3();
	
	public static void m4() {
		System.out.println("m4 method");
	}
	
	// method defined in sub class
	//private abstract void m5();
	
	//public final abstract void m6();
}
