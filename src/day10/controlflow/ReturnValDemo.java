package day10.controlflow;
public class ReturnValDemo {
    public static void main(String[] args) {
    	     //int z = m();
          // System.out.println("m() has returned > "+z);
           
          // System.out.println("Current operation result is: " + calculate(10, 5, 5));
           m2();
    }
    
    static int m(){ //data type of the method's declared return value is int.
           
    	System.out.println("in m()");
           return 1; //data type of the returned value is int
    }
    
    /**
     * @param x
     * @param y
     * @param operation  1 -> add, 2 -> sub, 3 -> mul, 4 -> div
     * @return
     */
    public static int calculate(int x, int y, int operation){
    	
    	if(operation == 1)
    		return x+y;
    	if(operation == 2)
    		return x-y;
    	if(operation == 3)
    		return x*y;
    	if(operation == 4)
    		return x/y;
    	
    	return 0;
    }
    
    public static void m2(){
    	System.out.println("First Statement");
    	System.out.println("Second Statement");
    	System.out.println("Third Statement");
    	//return;
    }
}