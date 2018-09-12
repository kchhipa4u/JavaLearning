package day48.langPackage.cloning;

public class Address {

	String street;
	String city;
	String pin;
	String country;
	String state;
	
	public Address() {}

	public Address(String street, String city) {
		this.street = street;
		this.city = city;
	}

	public Address(String street, String city, String pin, String country, String state) {
		this.street = street;
		this.city = city;
		this.pin = pin;
		this.country = country;
		this.state = state;
	}

	public static void main(String[] args) {
		 Address adr1 = new Address("Ocean Park", "Indore");
		 Address adr2 = new Address();
		 
		 System.out.println(adr1);
		 System.out.println(adr2);
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pin=" + pin + ", country=" + country + ", state="
				+ state + "]";
	}
}
