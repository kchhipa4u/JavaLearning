package day41.instancecontrolflow;
class ICFTest{

     int i =10;

     {
         m1();
        System.out.println("First Instance Block");
     }

     ICFTest(){
      System.out.println("Constructor");
   }

   public static void main(String[] args) {
	   ICFTest t = new ICFTest();
	   System.out.println("main");
	   ICFTest t1 = new ICFTest();
   }

    public void m1()
    {
       System.out.println(j);
    }

    {
       System.out.println("Second Instance Block");
    }

    int j = 20;

}