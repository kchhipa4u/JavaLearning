package day51.interfaceConcept;

public class Dog implements Animal {

	@Override
	public void walk() {
         System.out.println("Dog walk");
	}

	@Override
	public void run() {
		System.out.println("Dog run");
	}

	@Override
	public void eat() {
		System.out.println("Dog eat");
	}
	
	public void bark() {
		System.out.println("Dog barking");
	}

}
