package day35.overriding;

class Super
{
	public void display() {
		System.out.println("Super");
	}
}

class Sub extends Super
{
	@Override
	public void display() {
		System.out.println("Sub");
	}
}

public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		Super sup = new Sub();
		sup.display();
	}
}
