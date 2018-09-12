package day18.scopeofVariables;

public class Test {

	public static void main(String[] args) {
		int x;
		if(args.length > 0){
			x=20;
			System.out.println(x);
		}
	   //System.out.println(x);
		System.out.println("x never used....");
	}
}
