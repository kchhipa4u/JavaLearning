package day12.operators;
 
/**
 * @author kanhaiya.chhipa

OUTPUT
 
4 - 100
5 - 101

 & operator
4 - 100

 ^ operator
1 -  1

 | operator
5 - 101
 
*/
 
public class BitWiseOperatorTest {
    public static void main(String[] args) {
           
           int x=4; //100
           int y=5; //101
 
           System.out.println(x+" - "+Integer.toBinaryString(x));
           System.out.println(y+" - "+Integer.toBinaryString(y));
 
           int z=x&y;
           System.out.println("\n & operator");
           System.out.println(z+" - "+Integer.toBinaryString(z));
          
 
           /*int z=x|y;
           System.out.println("\n | operator");
           System.out.println(z+" - "+Integer.toBinaryString(z));*/
           
           
          /*int z=x^y;
           System.out.println("\n ^ operator");
           System.out.println(z+" -  "+Integer.toBinaryString(z));*/
           
           
           // Negation operation
              // complietime error, not applicable for boolean value
           //System.out.println(~true); 
           System.out.println("\n ~ operator");
           System.out.println(~4);
           
           /*
            *   4 => 000000....... 0100  --- 32 times
            *   Left most bit represent signed bit  0 -> positive   1 -> Negative
            *   
            *   ~4 => 11111 ..... 1011    => here left most bit will represent negative sign
            *   Now we need to calculate 2's compliment here.
            *   
            *   How to calculate 2's compliment
            *   
            *         11111 ..... 1011
            *         00000 ..... 0100
            *                      + 1
            *        -------------------
            *        000000...... 0101
            *        
            *      
            * 
            */
           int randInt = (int) (Math.random()*1000);
           System.out.println(randInt);
           if((randInt & 1) == 0)
           {
               System.out.println("Odd number.");
           }
           else
           {
        	   System.out.println("Even number.");
           }
           
           System.out.println(Math.pow(2, 3));
           
           
    }
 
}