package day48.langPackage.cloning;

public class TimeDemo {

	public static void main(String[] args) throws InterruptedException {
		long start = System.nanoTime();
		Thread.sleep(1000);
		long end = System.nanoTime();
		
		System.out.println("Time taken(s): " + (end - start)/1.0e9);
	}
}
