package day14.Arrays;

public class MultiDArray {

	public static void main(String[] args) {
		//int int2dArrayyy[][] = new int[][3]; 
		
		int int2dArrayy[][] = new int[3][];
		//int2dArrayy[0] = {8};
		int2dArrayy[0] = new int[]{1, 2, 3};
		int2dArrayy[1] = new int[]{4, 5};
		int2dArrayy[2] = new int[]{6};
		
		System.out.println(int2dArrayy[2][0]);
	
	}
}
