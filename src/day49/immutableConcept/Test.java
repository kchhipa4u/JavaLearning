package day49.immutableConcept;

public class Test {

	private int i;

	public Test(int i) {
		this.i = i;
	}
	
	public static void main(String[] args) {
		Test t1 = new Test(10);
		t1.i  = 100;
		System.out.println(t1.i);
		
		Test modified = t1.modifyMe(200);
		System.out.println(modified.i);
	}
	
	public Test modifyMe(int i) {
		if(this.i == i) {
			return this;
		}
		else {
			return new Test(i);
		}
	}
}
