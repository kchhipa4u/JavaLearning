package day51.interfaceConcept;

interface I1{
	interface I2{
		public void m1();
	}
}

public class NestedInterfaceDemo implements I1.I2 {

	@Override
	public void m1() {
      System.out.println("Nested interface defination");		
	}
	
	public static void main(String[] args) {
		NestedInterfaceDemo aa = new NestedInterfaceDemo();
		aa.m1();
	}

}
