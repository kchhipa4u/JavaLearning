package day52.abstractClassConcept;

public class ClientShape {

	public static void main(String[] args) {
		
		/*Shape s = new Shape("RED");
		s.getArea();*/
		
		Shape rectShape = new Rectangle("BLUE", 20, 30);
		
		System.out.println(rectShape.getArea());
		
		Shape triShape = new Triangle("GREEN", 40, 50);
		System.out.println(triShape);
		System.out.println(triShape.getArea());
		
	}
}
