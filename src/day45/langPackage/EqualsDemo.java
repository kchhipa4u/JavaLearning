package day45.langPackage;

class Demo{
	String name;
}

public class EqualsDemo {

	public static void main(String[] args) {
		String s1 = new String("Kan");
		String s2 = new String("Kan");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1 = new StringBuffer("Abu");
		StringBuffer sb2 = new StringBuffer("Abu");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		System.out.println(d1.equals(d2));
		
		
		String s = new String("xyz");
		StringBuffer sb = new StringBuffer("xyz");
		
		//System.out.println(s == sb);
		
		System.out.println(s.equals(sb));  // No CTE or Runtime Error
		
		int x = 10;
		int y = 10;
		System.out.println(x == y);
		
		
		Thread t = new Thread();
		System.out.println(t == null); // false
		System.out.println(t.equals(null));
		
	}
}
