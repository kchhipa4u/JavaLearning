package day19.staticindetails;
public class Demo
{
  static double $rate;
  static int numOfDollars;
  int x;
  
  static
  {
    $rate = 66.6;
    numOfDollars = 12;
    //x = 55;  // we cannot access instance variables in static block
    System.out.println("I am static block, I am called first.");
  }
  
  public static void main(String args[])
  {
	  int z = 0;
	  System.out.println(z);
    Demo d1 = new Demo();
    System.out.println("I am main() method, executed after static block.");
    System.out.println("Dollar value in Rupees: " + $rate * numOfDollars);
  }
}