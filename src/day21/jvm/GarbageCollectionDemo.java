package day21.jvm;

/**
 * @author kanhaiya.chhipa
 * -verbose:gc
 */
public class GarbageCollectionDemo {

	public static void main(String[] args) {
		System.out.println("Garbage Collection !!");
		GarbageCollectionDemo demo = new GarbageCollectionDemo();
		demo = null;
		System.gc();
	}
}
