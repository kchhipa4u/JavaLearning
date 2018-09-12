package day44.trywithresource;
class MyResource implements AutoCloseable {
    void useResource() {
    	System.out.println("ABC");
    }

    public static void main(String[] args) throws Exception {
    	try (MyResource r = new MyResource()) { // Compile-time error
    	    r.useResource();
    	}
	}

	@Override
	public void close() throws Exception {
		System.out.println("My way of closing this resource...");		
	}

}