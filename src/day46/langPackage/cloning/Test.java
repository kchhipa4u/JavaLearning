package day46.langPackage.cloning;

class Test implements Cloneable
{
     int i = 10;
     int j = 20;
     
   public static void main(String[] args) throws CloneNotSupportedException {
        Test t1 = new Test();
        System.out.println(t1.i + "   "+ t1.j);
        //protected native Object clone() throws CloneNotSupportedException;
        
        Test t2 = (Test) t1.clone();
        System.out.println(t2.i + "   "+ t2.j);
        
        t2.i = 111;
        t2.j = 222;
        
        System.out.println(t2.i + "   "+ t2.j);
        System.out.println(t1.i + "   "+ t1.j);
      
   }
}