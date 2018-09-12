package day46.stringExamples;

public class StringInterestingQuestions {

	public static void main(String[] args) {

		/*String s1 = new String("hello");
		String s2 = s1.toUpperCase();
		String s3 = s1.toLowerCase();

		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // true
		
		System.out.println("=============================================");
		
		String s4 = new String("hello");  
		String s5 = s4.toUpperCase();
		String s6 = s5.toLowerCase();

		System.out.println(s4 == s5);
		System.out.println(s4 == s6);*/
		
		System.out.println("=============================================");
		
		String s1 = "hello";
		String s2 = s1.toString();
		
		System.out.println(s1 == s2);
		
		String s3 = s1.toLowerCase();
		String s4 = s1.toUpperCase();
		String s5 = s4.toLowerCase();
		System.out.println(s1 == s3);
		
		System.out.println(s1 == s5);
		System.out.println(s2 == s5);
		System.out.println(s3 == s5);
		
		
	}
}
