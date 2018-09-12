package day15.scopeofVariables;

public class TestStudent {

	public static void main(String[] args) {
		/*Student s1 = new Student();
		s1.setName("Aarush");
		s1.setRollNo(1);
		//s1.setcName("IIT-D");
		
		Student s2 = new Student();
		s2.setName("Anita");
		s2.setRollNo(2);
		//s2.setcName("IIT-D");
		
		Student s3 = new Student();
		s3.setName("Javed");
		s3.setRollNo(3);
		//s3.setcName("IIT-D");
*/		
		
		Student s1 = new Student("Aarush", 1);
		Student s2 = new Student("Anita", 2);
		Student s3 = new Student("Javed", 3);
		
		System.out.println();
	}
	
	
}
