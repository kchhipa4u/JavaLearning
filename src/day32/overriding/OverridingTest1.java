package day32.overriding;
class QA { 
        
	   public void responsibility()   // Overridden method
		{
		   System.out.println("QA related work");
		} 
	   
	   public void m1(int x) {
		   System.out.println("x is: "+ x);
	   }
	   
	   public void displayParent() {
		   System.out.println("disply parent method called...");
	   }
   }
   
   class Developer extends QA{
        public void responsibility()   // Overriding method
		{
		   System.out.println("Developer related work");
		}
        
        public void m1(float f) {
 		   System.out.println("f is: "+ f);
 	   }
        
       public void displayChild() {
    	   System.out.println("disply child method called...");
       }
   }
   
   public class OverridingTest1 {
     public static void main(String[] args) {
		// Overriding Cases
    	 
    	QA q = new QA();
		q.responsibility();
		
		Developer d = new Developer();
		d.responsibility();
		
		QA qq = new Developer();
		qq.responsibility();
		
		// Overloading cases
		
		QA q3 = new Developer();
		q3.displayParent();
		//q3.m1(x);
		
}
      
   
   }