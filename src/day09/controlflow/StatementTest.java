package day09.controlflow;
 public class StatementTest {
    public static void main(String[] args) {
           int marks = 61;
 
           if(marks>=80){
                  System.out.println(">=80 - Grade A");
           }
           else if(marks>=60){
                  System.out.println(">=60 - Grade B");
           }
           else if(marks>=40){
                  System.out.println(">=40 - Grade C");
           }
           else{
                  System.out.println("<40 - FAIL");
           }
    }
}