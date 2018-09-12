package day36.MultilevelTypecasting;

public class Employee {

	private String name;
	private int salary;
	
	public Employee() {
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	/*@Override
	public boolean equals(Object e) {
		int sal = ((Employee) e).getSalary();
		
		if(this.salary == sal && this.name.equals(((Employee) e).getName()))
		{
			return true;
		}
		return false;
	}*/
	
}
