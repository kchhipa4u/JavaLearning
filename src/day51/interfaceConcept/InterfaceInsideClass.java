package day51.interfaceConcept;

class Demo{
	interface I3{
		public void m3();
	}
}

interface I4{
	public void m4();
}

interface I5{
	public void m5();
}

public class InterfaceInsideClass implements Demo.I3, I4, I5 {

	public static void main(String[] args) {
		InterfaceInsideClass a = new InterfaceInsideClass();
	}

	@Override
	public void m3() {
		System.out.println("Interface inside class example...");
	}

	@Override
	public void m5() {
	}

	@Override
	public void m4() {
	}
}
