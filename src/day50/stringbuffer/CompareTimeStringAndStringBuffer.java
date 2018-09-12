package day50.stringbuffer;

public class CompareTimeStringAndStringBuffer {

	public static void main(String[] args) {
		compareTime();
	}
	
	private static void compareTime() {
        long startTime;
        String str = "";
        StringBuffer buffer = new StringBuffer();
        
        // Using String
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += "extra";
        }
        System.out.println("Time using String: "
                + (System.currentTimeMillis() - startTime) + " ms.");
        
        // Using StringBuffer
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            buffer.append("extra");
        }
        System.out.println("Time using StringBuffer: "
                + (System.currentTimeMillis() - startTime) + " ms.");
    }

}
