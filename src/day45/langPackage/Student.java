package day45.langPackage;
class Student{
      String name;
	  int rollNo;
	  
	  public Student(String name, int rollNo){
	     this.name = name;
		 this.rollNo = rollNo;
	  }
	  
	  @Override
	  public String toString() {
	        return "[ name: "+ name +", RollNo: "+ rollNo+ " ]";
	  }
	  
	@Override
	public int hashCode() {
		return rollNo;
	}
	  
	  
	  public static void main(String[] a){
	     Student s1 = new Student("Kanhaiya", 10);
	     Student s2 = new Student("Neha", 20);
	     Student s3 = new Student("Abu", 30);
		 
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
		 System.out.println(s3.hashCode());
	  }
   }