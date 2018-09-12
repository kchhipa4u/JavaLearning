package day45.langPackage;

public class LoopDemo {

	public static String myWay() {
		for(;;)
		{
			System.out.println("Kanhaiya");
			if("Kanhaiya".length()>0) {
				return "Kanhaiya";
			}
		}
	}
	
	public static void main(String[] args) {
		myWay();
	}
}
