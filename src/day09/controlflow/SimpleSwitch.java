package day09.controlflow;
 public class SimpleSwitch {
    public static void main(String[] args) {
 
           char grade = 'G';
 
           int marks = 70;

           switch (grade) {
                  case 'A':
                        System.out.println("Grade A - marks >=80");
						if(marks > 60){
                        	System.out.println("Good Job");
                        }
                        break;
    
                  case 'B':
                        System.out.println("Grade B - marks >=60");
                        break;
 
                  case 'C':
                        System.out.println("Grade C - marks >=40");
                        break;
                        
                  case 'F':
                        System.out.println("Grade F - marks <40 FAIL");
                        break;
                        
                  default : //optional
                        System.out.println("Invalid Grade");
                        break; //optional
           }
    }
}