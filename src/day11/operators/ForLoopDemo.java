package day11.operators;

public class ForLoopDemo {

	public static void main(String[] args) {
		//int sum=0;
		
		// Normal For Loop
		
		/*for(int i=1; i <=10; i++)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);*/
		
		/*for (;;) {
			System.out.println("Infinite Loop");
		}*/
		
		/*while(true){
			System.out.println("Infinite Loop in while");
		}*/
		
		//Advance For Loop
		
		int[] ar =  {11, 22, 33, 44, 55};
	     
		/*for (int n : ar) {
	          System.out.println(n);
	      }*/
		
		for(int x=6; x < ar.length; x++)  // CTRL + SHIFT + I
		{
			System.out.println(ar[x]);
		}
	}
	
}
