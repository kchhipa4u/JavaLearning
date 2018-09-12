package day27.datahidingAndAbstraction;

public class Employee {

	// Loosely Encapsulated class,
	// No Data Hiding
	// Data Hiding
	private int salary;
	// Not Data Hiding
	// public String name;

	// abstraction
	public int getSalary() {
		return salary;
	}

	// abstraction
	public void setSalary(int salary) {
		if (salary < 0) {
			System.out.println("Please provide salary in more than zero");
			return;
		}
		this.salary = salary;
	}

}
