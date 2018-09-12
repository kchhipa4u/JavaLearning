package day28.inheritance;

public class Address {

	String firstLine;
	String secondLine;
	String city;
	int pin;
	
	public Address() {
	}

	public Address(String firstLine, String secondLine, String city, int pin) {
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.city = city;
		this.pin = pin;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [firstLine=" + firstLine + ", secondLine=" + secondLine + ", city=" + city + ", pin=" + pin
				+ "]";
	}
}
