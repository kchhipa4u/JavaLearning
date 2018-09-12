package day32.overriding;

public class NormalCalculator implements ICalc {

	// public void add(int x, int y);
	@Override
	public void add(int x, int y) {
      System.out.println("sum is: " + (x+y));		
	}


}
