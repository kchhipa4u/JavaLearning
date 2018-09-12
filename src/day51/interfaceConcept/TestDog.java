package day51.interfaceConcept;

public class TestDog {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		d.walk();
		d.run();
		
		Animal a = new Dog();
		a.eat();
		a.walk();
		a.run();
		
	}
}
