package day09.controlflow;
 public class SwitchWithString {
    public static void main(String[] args) {
 
           String marks="marks >=60";
           switch (marks) {
                  case "marks >=80":
                        System.out.println("Grade A");
                        break;
    
                  case "marks >=60":
                        System.out.println("Grade B");
                        break;
 
                  case "marks >=40":
                        System.out.println("Grade C");
                        break;
                        
                  case "marks <40 FAIL":
                        System.out.println("Grade F");
                        break;
                        
                  default : //optional
                        System.out.println("Invalid marks");
                        break; //optional
           }
           
           System.out.println("Execute after Switch statement...");
    }
}