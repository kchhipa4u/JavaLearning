package day49.immutableConcept;
// An immutable class
public final class Student
{
    final private String firstName;
    final private StringBuffer lastName;
    final private int regNo;
 
    public Student(String name, int regNo, StringBuffer lastName)
    {
        this.firstName = name;
        this.lastName = lastName;
        this.regNo = regNo;
    }
    
    public String getFirstName() {
		return firstName;
	}

	public StringBuffer getLastName() {
		return lastName;
	}

	public int getRegNo()
    {
        return regNo;
    }
    // 1. No setters in immutable class, else it could mutate the created object
   /* public void setName(String name) {
		this.name = name;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}*/
	public static void main(String args[])
    {
		StringBuffer sb = new StringBuffer("xyz");
        Student s = new Student("Abu", 101, sb);
        
       // s.regNo = 102;
       // s.firstName = "Kanhaiya";
        System.out.println(s.getFirstName());
       // System.out.println(s.firstName.t);
        
        String newFirstName = s.getFirstName().toUpperCase();
        
        System.out.println(s.getFirstName());
        
        //s.getLastName().append("Kanhaiya");
        
        //System.out.println(s.firstName);
       // System.out.println(s.regNo);
        
        //s.setName("Kanhaiya");
 
        // Uncommenting below line causes error
        //s.regNo = 102;
    }
}