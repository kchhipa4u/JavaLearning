package day20.statakandheap;
class Employee {
  
     String name;
	 int salary;
	 
	 public Employee(String myName, int salary){
	      this.name = myName;
		  this.salary = salary;
	 }

	 void method1(Employee m1){
		  System.out.println("Line no 13: " + m1.name);
		  m1.name = "Neha";
		  System.out.println(m1.name);
	  }

	void method2() {
		method1(this);
	}
	 
	 public static void main(String[] a){
	     Employee e1 = new Employee("Kan", 2000);
    	
		  System.out.println(e1.name);          // Kan
		  System.out.println(e1.salary);        // 20
		  
		  e1.method2();
		  
		  System.out.println(e1.name);
		 
	 }
  
  
  }