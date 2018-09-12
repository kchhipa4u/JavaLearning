package day46.langPackage.cloning;
class City implements Cloneable {

    private String name;

    public City(String name) {
		this.name = name;
	}

	public City clone() throws CloneNotSupportedException {

    return (City) super.clone();

    }
	
	public City(City original) {
		this.name = new String(original.name);
	}

	@Override
	public String toString() {
		return "City [name=" + name + "]";
	}
	
}