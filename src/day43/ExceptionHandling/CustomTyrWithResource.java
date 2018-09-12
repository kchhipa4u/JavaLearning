package day43.ExceptionHandling;

class MyResource implements AutoCloseable {
    public void close() throws Exception {
        int x = 1;
        //...
        if(x == 1) 
        	throw new Exception("Close Exception");
    }
    void useResource() {
    	System.out.println("inside useResource() method..");
    }
}

public class CustomTyrWithResource {

	public static void main(String[] args) {
		try (MyResource r = new MyResource()) { // Problem gone!
		    r.useResource();
		    
		    // Exception
		} 
		catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
}
