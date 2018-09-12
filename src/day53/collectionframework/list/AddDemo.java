package day53.collectionframework.list;

public class AddDemo {

	private int total = 0;
	
	public int add(int x) {
		return total  += x;
	}
	
	public static void main(String[] args) {
		
		AddDemo demo = new AddDemo();
		System.out.println(demo.add(40));
		
		AddDemo demo1 = new AddDemo();
		System.out.println(demo1.add(12));
	}
}
