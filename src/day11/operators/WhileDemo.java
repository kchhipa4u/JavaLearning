package day11.operators;

import java.util.Scanner;

public class WhileDemo {
	
	public static void main(String[] args) {
		boolean areWeWaitingForToss = true;
		int x =0;  // Toss has not happened Yet
		           // x =1 , Toss completed
		
		System.out.println("Is coin tossed ");
		
		/*Scanner sc = new Scanner(System.in);
		isCoinTossed = sc.nextBoolean();*/
		
      // ! true ------> 		
		while (x < 1) {   // ALT + SHIFT + R for renaming
		  
			System.out.println("Toss begins in 15 mins");
			
			System.out.println("After 15 mins ");
			
			//isCoinTossed = true;
			x =1;
			
			System.out.println("Game started now....");
			
		}
	}

}
