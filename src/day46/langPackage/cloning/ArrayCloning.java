package day46.langPackage.cloning;

public class ArrayCloning {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] c = {1,2,3};
		
		System.out.println(a[0] == c[0]);
		
		//System.out.println(a[0].equals(c[]));
		
	    int[] b = a.clone();
	    // int[] b = (int[]) a.clone();

	    System.out.println(a == b ? "Same Instance":"Different Instance");
	}
}
