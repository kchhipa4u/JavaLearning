package day36.MultilevelTypecasting;

public class MultiLevelTypeCastDemo {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		
		Number n2 = new Integer(10);
		
		Number n = (Number) i;
		
		Object o = (Object)n;
		
		System.out.println("Testing");
		
		System.out.println(i == n2);
		System.out.println(i.equals(n2));
		System.out.println(i == n);
	}
}
