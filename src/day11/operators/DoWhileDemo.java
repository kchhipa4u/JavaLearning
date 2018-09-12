package day11.operators;

import java.util.Scanner;

public class DoWhileDemo {
	
	public static void main(String[] args) {
		// Input with validity check
		boolean valid = true;
		int number;
		do {
		  // prompt user to enter an int between 1 and 10
			System.out.println("Please enter number between 1 and 10");
			
			Scanner s = new Scanner(System.in);
			number = s.nextInt();
		  //......
		  // if the number entered is valid, set done to exit the loop
		  if (number >=1 && number <= 10) {
			  
		     valid = false;
		  }
		} while (valid);  // Need a semi-colon to terminate do-while
	}

}
