package day31.overloading;

class Animal {
}

class Monkey extends Animal {

}

public class Test5 {

	public void m1(Animal a) {
		System.out.println("Animal Version");
	}

	public void m1(Monkey a) {
		System.out.println("Monkey Version");
	}

	public static void main(String[] args) {
		Animal a = new Animal();

		Test5 t = new Test5();
		t.m1(new Animal());
		
		Monkey m = new Monkey();
		t.m1(m);
		
		Animal a1 = new Monkey();
		t.m1(a1);
	}

}
