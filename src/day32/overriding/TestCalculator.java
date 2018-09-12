package day32.overriding;

public class TestCalculator {

	public static void main(String[] args) {
		//ICalc a = new ICalc();
		
		ICalc a = new NormalCalculator();
		a.add(10, 20);
				
		ICalc sciCal = new SciCalc();
		sciCal.add(30, 40);
		
		
	}
}
