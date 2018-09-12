package day45.langPackage;

class Emp
{
	public void m1() {
		System.out.println("I am student");
	}
	
	@Override
	public boolean equals(Object obj) {
			  
			Emp s = (Emp)obj;  // String
			return false;
		}
}


public class TypeCaseDemo {
	//Object o1 = new Object();
	
	public static void main(String[] args) {
		Object o2 = new Emp();
		
		Object o1 = new Object();
		Emp e = new Emp();
		//Emp e = new Object();
		 
		  Emp e2  =  (Emp) o2;
		  e2.m1();
	}
	   
	 
	
	// Student  s1   =  (Student)o1;
}
