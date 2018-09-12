package day15.scopeofVariables;

public class Student {

	String name;
	int rollNo;
	static String cName = "IIT-D";
	
	static int noOFStudents;
	
	public String getName() {
		return name;
	}
	
	
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		noOFStudents++;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", cName=" + cName + "]";
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student("Aarush", 1);
		Student s2 = new Student("Anita", 2);
		Student s3 = new Student("Javed", 3);
		
		System.out.println(s1.noOFStudents);
	}

}
