package day28.inheritance;

public class TestIsA {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.getSalary();  // This works fine
		// e1.writeCode();  // Complietime error
		
		Programmer p1 = new Programmer();
		p1.writeCode();
		p1.getSalary();
		
		Employee e2 = new Programmer();
		
		e2.getSalary();
		//e2.writeCode(); // invalid
		
	//	Programmer p2 = new Employee();
		
	}
}
