package day10.controlflow;
public class BreakStatementTest {
    public static void main(String[] args) {
 
           for (int i = 0; i < 3; i++) {
                  if(i>1){
                        break;
                  }
                  System.out.println("i= " + i); 
           }
           
    }
}