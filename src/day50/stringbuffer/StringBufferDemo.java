package day50.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		// 1st Constructor
		StringBuffer sb = new StringBuffer();	
		System.out.println("Empty StringBuffer "+ sb);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(30);
		System.out.println("Capacity after providing ensure capacity " + sb.capacity());
		
		sb.append("abcdefghijklmnop");
		
		System.out.println(sb.capacity());
		
		sb.append("q");
		
		System.out.println(sb.capacity());
		
		//sb = "xyz";
		
		Integer i = 50;
		
		// 2nd Constructor
		StringBuffer sb1 = new StringBuffer(10);
		System.out.println(sb1.capacity());
		sb1.append("qwertyuiop");
		System.out.println(sb1.capacity());
		sb1.append("a");
		System.out.println(sb1.capacity());
		
		// 3rd Constructor
		
		StringBuffer sb2 = new StringBuffer("Kanhaiya");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2.charAt(6));
		sb2.setCharAt(6, 'P');
		//System.out.println(sb2.setCharAt(6, 'P'));
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer();
		sb3.append("Abu");
		sb3.append(3);
		System.out.println(sb3);
		
		System.out.println("=========================================");
		
		StringBuffer sb4 = new StringBuffer("Hello ");
		sb4.append("World ");
		sb4.append(2018);
		System.out.println(sb4);

		StringBuffer sb5 = new StringBuffer("HelloWorld ");
		sb5.insert(5, " ");
		sb5.insert(sb5.length(), 2018);
		System.out.println(sb5);
		
		System.out.println(sb4.reverse());
		
		StringBuffer sb6 = new StringBuffer("Hello World!");
		System.out.println(sb6.deleteCharAt(5));
		
		StringBuffer sb7 = new StringBuffer("Hello World!");

		System.out.println(sb7.replace(6,11,"Earth")); //prints "Hello Earth!"
	}
}
