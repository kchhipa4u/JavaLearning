
public class TestStudent {

	public static void main(String[] args) {
		
		// 1. Creating a new Student Object
        Student s = new Student();

        // 2. Setting student's state
        s.id = 1000;
        s.name = "Joan";
        s.gender = "male";

        System.out.println(s.name);
        
       // 3. updating profile with correct name
      boolean isNameSet = s.updateProfile("Jhon");
      
      if(isNameSet)
      {
    	  System.out.println("Yes, you set the name correctly");
      }
      else{
    	  System.out.println("You did not set the name correctly");
      }
       
       System.out.println(s.name);
	}
}
