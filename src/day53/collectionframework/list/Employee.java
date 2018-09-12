package day53.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

class Address {
	String addressType;
	
	public Address(String addressType) {
		super();
		this.addressType = addressType;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	@Override
	public String toString() {
		return "Address [addressType=" + addressType + "]";
	}
	
}

public class Employee {

	List<Address> addresses = null;
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(List<Address> addresses) {
		super();
		this.addresses = addresses;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [addresses=" + addresses + "]";
	}

	public static void main(String[] args) {
		
		List<Address> addresses = new ArrayList<>();
		Address a1 = new Address("Permanent Address");
		Address a2 = new Address("Current Address");
		Address a3 = null;
		addresses.add(a1);
		addresses.add(a2);
		addresses.add(a3);
		
		Employee e1 = new Employee(addresses);
		
		System.out.println(e1.getName().toUpperCase());
		//System.out.println(e1);
		
		//List<Address> addresses2 = e1.getAddresses();
		
		/*for (Address address : addresses2) {
			System.out.println(address);
			System.out.println(address.getAddressType());
		}*/
		
		//System.out.println(e1.getAddresses().get(2).getAddressType());
		
	}
}
