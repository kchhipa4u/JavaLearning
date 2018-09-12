package day46.stringExamples;

public class FirstDemo {

	public static void main(String[] args) {
		String s = new String("Hello ");
		s.concat("World");
		System.out.println(s);

		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("World");
		System.out.println(sb);
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}
}
