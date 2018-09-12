package day49.immutableConcept;

public class ImmutableEmployee {
	private final String name;
	private final int age;
	private final Address empAddress;

	ImmutableEmployee(String name, int age, String add1, String add2, String city) {
		this.name = name;
		this.age = age;
		// don't pass reference around create a new object with in constructor
		empAddress = new Address();
		empAddress.setAddressLine1(add1);
		empAddress.setAddressLine2(add2);
		empAddress.setCity(city);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	 public ImmutableEmployee(String name, int age, Address empAddress)
	  {
	      this.name = name;
		  this.age = age;
		  this.empAddress = empAddress;
	  }
	

	/*public Address getEmpAddress() {
		return empAddress;
	}*/
	
	public Address getEmpAddress() {
		Address adr = new Address();
		adr.setAddressLine1(empAddress.getAddressLine1());
		adr.setAddressLine2(empAddress.getAddressLine2());
		adr.setCity(empAddress.getCity());
		return adr;
	}

	public String toString() {
		return "Name " + name + " Age " + age + " Address " + empAddress;
	}

	public static void main(String[] args) {
		ImmutableEmployee ie = new ImmutableEmployee("Kanhaiya", 32, "Ocean Park", "Nipania", "Indore");
		System.out.println("Employee information " + ie);
		
		Address adr = ie.getEmpAddress();
		adr.setCity("Delhi");
		System.out.println("Employee information " + ie);
	}

}