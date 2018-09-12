package day43.ExceptionHandling;

public class Emp {
	String name;
	int salary;
	String designation;
	
	public Emp(String name, int salary, String designation) {
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}


	public static void main(String[] args) {
		Emp e1 = new Emp("Abu", 50000, "Manager");
		System.out.println(e1);
		System.out.println("End of Program");
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	
}
