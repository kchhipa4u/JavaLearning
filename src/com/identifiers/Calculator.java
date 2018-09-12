package com.identifiers;


class Calculator {
	int x;
	int y;
	
	int u, v, w;
	
	int name = 25;
	
	int fName = 5;
	int lName = 10;
	
	//int z = javaabc;
	
	// Standard way
	String firstName;
	
	// Not recommenned way
	String lastname;
	
	
	public final int NO_OF_DAYS_IN_WEEK = 7;

	public void addMe(int x, int y) { // this is correct way
       System.out.println(x+y);
	} 

	public void AddMe(int x, int y){// not recommended
		System.out.println(x+y); 
		System.out.println(fName + lName);
    }
}