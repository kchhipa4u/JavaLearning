package day45.langPackage;

public class Student1 {

    String name;
	  int rollNo;
	  
	  public Student1(String name, int rollNo){
	     this.name = name;
		 this.rollNo = rollNo;
	  }
	  
	@Override
	public boolean equals(Object obj) {
		try {
		String name1 = this.name;
		int rollNo1 = this.rollNo;
		  
		Student1 s = (Student1)obj;  // String
		String name2 = s.name;
		int rollNo2 = s.rollNo;
		
		if(name1.equals(name2) && rollNo1 == rollNo2)
		{
			return true;
		}
		return false;
		}
		catch(ClassCastException e)
		{
			return false;
		}
		catch(NullPointerException e)
		{
			return false;
		}
	}
	  
	/*  @Override
	public boolean equals(Object obj) {
		 if(obj instanceof Student1) {
			Student1 s = (Student1) obj; // String

			if (name.equals(s.name) && rollNo == s.rollNo) {
				return true;
			}
			return false;
		 }
		 return false;
	}*/
	  
	  public static void main(String[] a){
	     Student1 s1 = new Student1("Kanhaiya", 1);
	     Student1 s2 = new Student1("Kanhaiya", 2);
	     /*Student1 s3 = new Student1("Kanhaiya", 1);
	     Student1 s4 = s1;*/
		 
	     System.out.println(s1.equals(s2));
	     System.out.println(s1.equals("Kanhaiya"));   // False
	     
	     System.out.println(s1.equals(null));  // False
	     
		 // System.out.println(s1.equals(s2));
		 //System.out.println(s1.equals(s3));
		 //System.out.println(s1.equals(s4));
		 //System.out.println(s1.equals("Kanhaiya"));
	  }
 
}
