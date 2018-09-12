package day28.inheritance;

public class Student {

	static Address addr;
	
	String name;  // It is not like a primitive data type
	
	public Student() {}

	public Student(Address addr, String name) {
		this.addr = addr;
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [addr=" + addr + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Student s2 = new Student(addr, "Kanhaiya");
		System.out.println(s2);
	}
}
