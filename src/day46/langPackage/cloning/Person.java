package day46.langPackage.cloning;

class Person implements Cloneable {

	private String name; // Will holds address of the String object, instead of object itself
	private City city; // Will holds address of the City object, instead of City object
	final private int id = 1;

	public Person(String name, City city) {
		this.name = name;
		this.city = city;
	}

	public Person clone() throws CloneNotSupportedException {
		Person clonedObj = (Person) super.clone();
		clonedObj.name = new String(this.name);
		clonedObj.city = this.city.clone();

		return clonedObj;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

}