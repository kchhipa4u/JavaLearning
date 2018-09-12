package day46.stringExamples;

public class Student {

	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "Kan");
	    
	    s1.displayObj();
	    
	    Student s2 = new Student(2, "Abu");
	   s2.displayObj();
	}
	
	public  Student displayObj()
	{
		System.out.println(this);
		return null;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
}
