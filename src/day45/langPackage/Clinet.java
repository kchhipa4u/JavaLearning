package day45.langPackage;

class Address {

	String city, pin, street;

	public Address(String city, String pin, String street) {
		this.city = city;
		this.pin = pin;
		this.street = street;
	}

	public String getAddress() {
		return street + " " + city + " " + pin;
	}
}

   class Person  
   {
       Address adr;
	   
	   String name;
	   
	   public Person(Address adr, String name){
	      this.adr = adr;
		  this.name = name;
	   }
	   
	  public Address getPersonAddress(){
	        return  adr;
	   }
   
   }
   
   public class Clinet{
   
        public static void main(String[] a){
		   Address adr1 = new Address("Ocean Park", "Indore", "452010");
		   Person p1 = new Person(adr1, "Kanhaiya");
		    Address personAddress = p1.getPersonAddress();
		    System.out.println(personAddress.street);
		    System.out.println(personAddress);
		}
   }