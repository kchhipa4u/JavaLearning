package day46.langPackage.cloning;
public class CloningExample {

    public static void main(String[] args) throws CloneNotSupportedException {
    	City city = new City("Dehradun");
        Person person1 = new Person("Naresh", city);
        System.out.println(person1);

        Person person2 = person1.clone();
        person2.setCity(new City("Indore"));
        
        System.out.println(person2);
        
        System.out.println(person1);

    }
}