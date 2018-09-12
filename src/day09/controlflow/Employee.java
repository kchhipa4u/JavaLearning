package day09.controlflow;

public class Employee {

	int age;  // member variable, instance variable
	String name;  // member variable, instance variable
	
	// CTRL + SHIFT + S
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int myAge) {
		age = myAge;
	}
	public void setName(String myName) {
		name = myName;
	}
	public static void main(String[] args) {
		Employee abu = new Employee();
		System.out.println(abu.getAge());  // syso + press space
		
		abu.setAge(70);
		
		System.out.println(abu.getAge());
	}
}
