package day52.abstractClassConcept;

/**
 * @author kanhaiya.chhipa
 * 
 * Rule1 :- For abstract class definition and declaration of method both are possible
 * Rule2 :- In abstract class for abstract method abstract keyword is necessary.
 *
 */
public abstract  class Demo {

	//declaration, just like interface
	public abstract void m1();
	
	// definition
	public void m2() {
		System.out.println("method m2....");
	}
}
