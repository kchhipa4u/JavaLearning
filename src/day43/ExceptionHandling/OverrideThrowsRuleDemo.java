package day43.ExceptionHandling;

import java.io.IOException;

class Parent
{
	public void display() throws Exception {
		System.out.println("Parent dispaly()");
	}
}

class Child extends Parent{
	public void display() throws IOException {
		System.out.println("Child dispaly()");
	}
}


public class OverrideThrowsRuleDemo {
    
	public static void main(String[] args) throws Exception {
		  Child c = new Child();
		// What if I make parent reference and Child Object
		//Parent c = new Child();
		c.display();
	}
}
