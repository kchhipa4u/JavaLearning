package day37.staticcontrolflow;

// 1. Identification of static members from top to bottom.
// RIWO :- Read indirectly Write Only   i = 0, j = 0 [RIWO]

// 2. Execution of static variable assignments and static block from top to bottom.
public class Base1 {

		   static int i =10;  // 1
		   
		   static {
			   m1();
			   System.out.println("First Static Block");
		   }

		   public static void main(String[] a){
		         m1();
		         System.out.println("Main Method");
		  }

		   public static void m1(){
		      System.out.println(j);
		   }

		   static int j =20;
		   
		
}
