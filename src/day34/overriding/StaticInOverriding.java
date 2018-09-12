package day34.overriding;
// method hiding concept
class PP
{
     public static void m1(){
    	 System.out.println("Parent");
     }
}

class CC extends PP
{
    public static void m1(){
    	System.out.println("Child");
     }
}
public class StaticInOverriding {

	public static void main(String[] args) {
		
		PP p = new PP();
		p.m1();
		
		CC c = new CC();
		c.m1();
		
		PP p1 = new CC();
		p1.m1();
	}
}
