package day20.statakandheap;


/**
 *   1. resolved ambiguity   ---> this.name = name
 *   2. can be passed as an argument to any method   m2(this)
 *   3. you can call any method or variables using this keyword also.
 * 
 * @author kanhaiya.chhipa
 *
 */
public class Calc {

	public void sum(int x, int y)
	{
		this.sum(10, 20);  // infinite loop, incorrect programming, recursive calling
	}
	
	public static void main(String[] args) {
		Calc c = new Calc();
		c.sum(10, 20);
	}
}
