package day37.staticcontrolflow;
//1. Identification of static members from top to bottom. i = 0 [RIWO], j = 0; [1 - 6]
// 2. Execution of static variable assignments and static block from top to bottom.  [7 - 12], i = 10, j = 20
// 3. Execution of main method.
class Base {
   static int i =10;  // 1

   static{  // 2
         m1();
         System.out.println("First static block");
   }

   public static void main(String[] a){  //3
         m1();
         System.out.println("Main Method");
  }

   public static void m1(){  // 4
      System.out.println(j);
   }

   static{  // 5
         System.out.println("Second static block");
   }

   static int j =20;  // 6
   
}