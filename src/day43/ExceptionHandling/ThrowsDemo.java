package day43.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		try{
			PrintWriter pw = new PrintWriter("C:\\abc.txt");
			pw.println("Hello");
			//FileInputStream ios = new FileInputStream( "C:\\temp.txt" );
			}
			catch(FileNotFoundException e)
			{
			    System.out.println("File is not available.... ");	
			}
		    System.out.println("Come Here");
	}
}
