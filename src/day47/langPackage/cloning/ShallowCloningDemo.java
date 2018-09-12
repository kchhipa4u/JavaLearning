package day47.langPackage.cloning;
class ShallowCloningDemo{
  
    public static void main(String args[]) throws CloneNotSupportedException
    {
       Address adr = new Address("Ocean Park", "Indore", "452010");
       Employee emp1 = new Employee(adr, 30000);
       System.out.println("Employee 1: " + emp1);
       
          Employee emp2 = emp1.clone();
          
          System.out.println("Employee 2: " + emp2);
          emp2.setSalary(40000);
          
          /*System.out.println("Look inot emp1 an emp2 after salary Change");
          System.out.println(emp1);
          System.out.println(emp2);*/
          
          //emp2.getAdr().setPin("452020");
          Address empAddress2 = emp2.getAdr();
         // System.out.println(empAddress2);
          empAddress2.setPin("452020");
          
          System.out.println("Look inot emp2 after pin modification of emp2 itself");
          System.out.println(emp2);
          
          System.out.println("Look inot emp1 after pin modification of emp2");
          System.out.println(emp1);
       
       /*Employee emp2 = (Employee) emp1.clone();
       emp2.adr.city = "Delhi";

       System.out.println(emp1.adr.city+" ... "+ emp2.adr.city);*/
   }

}