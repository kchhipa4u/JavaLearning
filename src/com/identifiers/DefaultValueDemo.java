package com.identifiers;

public class DefaultValueDemo {

	boolean b = true;
	int x = 25;
	
	static int y = 20;
	
	int a, d, c;
	
	// Valid int range :- 2,147,483,627
	int number = -123;
	int sum = 1_23_45_67_890;     // This value is within the range of int
	//int bigSum = 8234567890;
	
	int number1 = 0B01010000101000101101000010100010;
	
	int number2 = 0B111;
	
	long num = 123;
	
	long num1 = 8234567890L;
	
	byte smallNumber = 127; 
	
	//double average = 55.66;
	float average = 55.66f;
	
	public static void main(String[] args) {
		DefaultValueDemo dv = new DefaultValueDemo();
		System.out.println(dv.b);
		System.out.println(dv.x);
		System.out.println(y);
		System.out.println(dv.number2);
		System.out.println(dv.sum);
		
		System.out.println(dv.num);
	}
}
