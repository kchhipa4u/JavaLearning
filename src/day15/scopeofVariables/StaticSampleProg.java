package day15.scopeofVariables;

public class StaticSampleProg {

	static int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		
		int z = 70;
	
		StaticSampleProg p1 = new StaticSampleProg();
		p1.x = 111;
		p1.y = 30;
		
		StaticSampleProg p2 = new StaticSampleProg();
		System.out.println("x is:- "+p2.x +" y is:- "+ p2.y);
		p1.display();
	}
	
	public void display(){
		int u = 70;
		System.out.println(u);
	}
	
}
