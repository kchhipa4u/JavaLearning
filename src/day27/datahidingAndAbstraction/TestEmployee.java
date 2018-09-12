package day27.datahidingAndAbstraction;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setSalary(10000);
		//e1.salary = -10000;
		System.out.println("Employee Salary is: " + e1.getSalary());
	}
}
