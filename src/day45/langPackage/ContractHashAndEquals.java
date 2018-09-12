package day45.langPackage;

class Bank{
	String name;
	public Bank(String name) {
		this.name = name;
	}
}

class ChildBank extends Bank{

	String city;

	public ChildBank(String name, String city) {
		super(name);
		this.city = city;
	}
}
public class ContractHashAndEquals {

	public static void main(String[] args) {
		
		Bank b1 = new Bank("AXIS");
		Bank b2 = b1;
		
		ChildBank cb1 = new ChildBank("AXIS_CHILD", "Delhi");
		
		b2 = cb1;
		//System.out.println(b2.);
		
		System.out.println(b1.equals(b2));
		
		System.out.println(b1.hashCode());  // 2018699554
		System.out.println(b2.hashCode());  // 2018699554
		
		String s1 = new String("Kan");
		String s2 = new String("Kan");

		System.out.println(s1.equals(s2));  // True

		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		StringBuffer sb1 = new StringBuffer("Kan");
		StringBuffer sb2 = new StringBuffer("Kan");

		System.out.println(sb1.equals(sb2));  // False


		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
	}
}
