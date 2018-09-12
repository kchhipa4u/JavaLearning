package day47.langPackage.cloning;

class Employee implements Cloneable {

	private Address adr;
	private int salary;

	public Employee(Address adr, int salary) {
		this.adr = adr;
		this.salary = salary;
	}

	//protected native Object clone() throws CloneNotSupportedException;
	/*public Employee clone() throws CloneNotSupportedException {
		return (Employee)super.clone();
	}*/
	
	/*public Employee clone() throws CloneNotSupportedException {
	       Address adr1 = new Address(adr.street, adr.city, adr.pin);
	       Employee emp2 = new Employee(adr1, salary);
	      return emp2;
	}*/
	
	public Employee clone() throws CloneNotSupportedException {
		Employee emp = (Employee)super.clone();
	    emp.adr =  emp.getAdr().clone();
		return emp;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [adr=" + adr + ", salary=" + salary + "]";
	}
	
}