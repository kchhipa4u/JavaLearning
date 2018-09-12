package day28.inheritance;

public class TestStudent {

	static Address addr1;
	public static void main(String[] args) {
		
		/*Address addr1 = new Address("Ocean Park", "Nipania", "Indore", 452010);
		//Address addr1 = new Address();
		//addr1.setCity("Indore");
		
		
		if(addr1.getCity().equals("Indore")) {
			System.out.println("Bingooo, you set the right city !!");
		}
		Student s1 = new Student(addr1 , "Abu");
		
		System.out.println(s1);
		
		String s = "neha";
		
		Address addr2 = new Address();
		//addr2.setFirstLine("First Line");
		
		Student s2 = new Student(addr2, "Kan");
		
		System.out.println(s2);*/
		
		Address adr = new Address();
		//adr.setCity("Delhi");
		
		Student s3 = new Student();
		s3.setAddr(adr);
		System.out.println(s3);
	}
}
