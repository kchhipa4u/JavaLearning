package day13.Arrays;
 public class BitShiftOperatorTest {
    public static void main(String[] args) {
           //128,64,32,16,   8,4,2,1
           int x=38; //0010 0110
 
           System.out.println(x+" - "+Integer.toBinaryString(x));
 
           // Left Shift Example
          /* int z=x<<2;
           System.out.println("\n << operator");
           System.out.println(z+" - "+Integer.toBinaryString(z));*/
           
           //int number = 0b1011_1000_1111_1010_1111_1000_1111_1010;
           int number = 0b0011_1000_1111_1010_1111_1000_1111_1010;
           //int number = 0b0000_0000_0000_0000_0000_0000_0010_0110;
           System.out.println("number in decimal format : " + number);
           number = number >> 2;
           System.out.println("number in decimal format : " + number);
           System.out.println(Integer.toBinaryString(number));
          
           // Right Shift Example
          /* System.out.println(x+" - "+Integer.toBinaryString(x));
           int z=x>>2;
           System.out.println("\n >> operator");
           System.out.println(z+" -  "+Integer.toBinaryString(z));*/
 
           
           
           /* 1.  >>> = right shift with zero fill or simply unsigned right shift operator
           
              2. ">>" it keeps sign bit intact i.e. if original number is negative then it will remain negative even 
                      after right shift i.e. first or most significant bit never lost
            
              3. ">>>" doesn't preserve sign of original number and fills the new place with zero, that's why it's known 
                     as unsigned right shift operator or simply right shift with zero fill.

            
            */
           
           // Right Shift with zero fill
           /*int right_shift_with_zero = 0b0111_1000_1111_1010_1111_1000_1111_1010;
           System.out.println("\n number in decimal format : " + right_shift_with_zero);
           right_shift_with_zero = right_shift_with_zero >>>1;
           System.out.println(right_shift_with_zero);
           System.out.println(Integer.toBinaryString(right_shift_with_zero));
           
           int negative_numright_shift_with_zero = 0b1111_0000_1111_0000_1111_0000_1111_1010;
           System.out.println("\n number in decimal format : " + negative_numright_shift_with_zero);
           negative_numright_shift_with_zero = negative_numright_shift_with_zero >>>1;
           System.out.println(negative_numright_shift_with_zero);
           System.out.println(Integer.toBinaryString(negative_numright_shift_with_zero));*/
           
          // System.out.println(-8 >> 1);
           
          // System.out.println(8 >> 1);
           
          // System.out.println(-8 >>> 1);
           
           //System.out.println(8 << 2);
           

    }
 
}