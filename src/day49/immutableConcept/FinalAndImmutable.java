package day49.immutableConcept;

public class FinalAndImmutable {

	final int i = 10;
	
	final StringBuffer sb; 

	
	public FinalAndImmutable(StringBuffer sb) {
		this.sb = sb;
	}


	public static void main(String[] args) {
         
		//sb = new StringBuffer("Hello");
		FinalAndImmutable obj1 = new FinalAndImmutable(new StringBuffer("xyz"));
		
		System.out.println(obj1.i);
		// Won't allow to change the instance value
		//obj1.i = 20;
		
		System.out.println(obj1.sb);
		System.out.println(obj1.sb.append(" World!!"));
		
		//obj1.sb = new StringBuffer("xyz");
	}
}
