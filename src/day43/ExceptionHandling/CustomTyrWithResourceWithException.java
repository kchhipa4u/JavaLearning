package day43.ExceptionHandling;

class MyResource1 implements AutoCloseable {
    public void close() throws Exception {
        int x = 1;
        //...
        if(x == 1) throw new Exception("Close Exception");
    }
    void useResource() {
    	System.out.println("inside useResource() method..");
    }
}

public class CustomTyrWithResourceWithException {

	public static void main(String[] args) {
		try (MyResource1 r = new MyResource1()) { // Problem gone!
		    r.useResource();
		    throw new Exception("Exception inside try");
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			
			for(Throwable x : e.getSuppressed())
			{
				System.out.println(x.getMessage());
			}
			//System.out.println(e.getSuppressed()[0].getMessage());
		}
	}
	
}
