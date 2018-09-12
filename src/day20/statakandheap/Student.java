package day20.statakandheap;

public class Student {

	String name;
	int fee;
	
	public Student(String name, int fee) {
		this.name = name;
		this.fee = fee;
	}
	
	public Student getStudent() {
		return new Student("Ram", 20000);
	}

    public static void main(String[] args) {
		Student s1 = new Student("Abu", 10000);
		
		Student s2;
		
		s2 = s1.getStudent();
    
		System.out.println();
	}
}
