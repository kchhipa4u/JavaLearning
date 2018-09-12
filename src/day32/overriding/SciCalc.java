package day32.overriding;

public class SciCalc implements ICalc {
	
	//public void add(int x, int y);
	
	@Override
	public void add(int x, int y) {
	  System.out.println("Sci calculator add method called");
	}

}
