package day09.controlflow;


/**
 * if-else statement.
 * 
 * @author kanhaiya.chhipa
 * 
 * If only one statement is used inside if then enclosing those statements in brackets is optional.
 * 
 */
public class CheckPassFail {
   public static void main(String[] args) {  // Program entry point
      int mark = 55;  // Set the value of "mark" here!
      System.out.println("The mark is " + mark);
      
      if(mark > 50 && mark < 80 )
    	  System.out.println("Congratulations!! You have cleared the exam..");
      else if(mark > 80)
    	  System.out.println("Bingooo!!, you are scholer");
      else
    	  System.out.println("You are Fail. Try hard next time...");
     
   }
}
