package day10.controlflow;
public class BreakInNestedLoop {
    public static void main(String[] args) {
 
           for (int i = 0; i < 3; i++) { //outer loop
                  
        	      if(i == 0){
        	    	  break;
        	      }
                  System.out.println("outer i= " + i);  
           
                  for (int j = 0; j < 3; j++) { //inner loop
                        if(j>0){
                               break;
                        }
                        System.out.println("inner i= " + i+", j= " + j);    
                  }//end inner loop
           }//end outer loop
           
    }
}