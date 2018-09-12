package day34.overriding;
class PPP
{
	// zero, one or more arguments
	// m1(), m1(int), m1(int, int), , m1(int, int,int)
     public void m1(int i){   // overridden
	   System.out.println("Parent");
     }
}

class CCC extends PPP
{
    public void m1(int... i){  // Overriding
    	System.out.println("Child");
    }
}
public class VarArgsInOverriding {

	public static void main(String[] args) {
		/*PPP p = new PPP();
		p.m1(10);   // Parent
*/
		//CCC c = new CCC();
		//c.m1(10);    // Child
		//c.m1(30, 50);     // Parent
		
		PPP p1 = new CCC();
		p1.m1(10);    // Parent
	}
}