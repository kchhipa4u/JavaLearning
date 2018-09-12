package day46.stringExamples;

public class DifferentWaysOfString {

	public static void main(String[] args) {
		String s = new String();  //Empty string
		System.out.println(s.length());
		
		String s1 = new String("hello");
		System.out.println(s1);
		
		char[] cArray = {'h','e','l','l','o'};

		String s2 = new String(cArray);
		System.out.println(s2);

		String s3 = "hello";   // recommended way
		  System.out.println(s3+ " world");
		System.out.println(s3);
	}
}
