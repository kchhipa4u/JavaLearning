package day45.langPackage;
class Test1{
  int i;
  int j;

   Test1(int i, int j){
     this.i = i;
	 this.j = j;
   } 
   
   @Override
   public int hashCode(){
       return i;
   }
   
   public static void main(String[] a){
      Test1 t1 = new Test1(97, 20);
      Test1 t2 = new Test1(100, 200);
      System.out.println(t1);  // toString()  => hashCode()
	  System.out.println(t2);  // toString()  => hashCode()
   }
}