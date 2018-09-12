package day48.langPackage.cloning;
public class Employee implements Cloneable {

    private String name;
    private String identifier;
    private PayPackDetails packDetails;

    public Employee(String name, String identifier, PayPackDetails packDetails) {
        this.name = name;
        this.identifier = identifier;
        this.packDetails = packDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public PayPackDetails getPackDetails() {
        return packDetails;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
    	Employee employee = (Employee)super.clone();
        employee.packDetails = packDetails.clone();
        return employee;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", identifier=" + identifier + ", packDetails=" + packDetails + "]";
    }

    // Case1
    
     public static void main(String[] args) throws CloneNotSupportedException {
    	 Employee employee1 = new Employee("Ram","1",new PayPackDetails());
    	    Employee employee2 = employee1.clone();
    	    employee2.setName("Krish"); employee2.setIdentifier("2");
    	    employee2.getPackDetails().setBasicSalary(700000d);

    	    System.out.println(employee1);
    	    System.out.println(employee2);
     
     }
         
}