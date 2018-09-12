package day32.overriding;
class PolymorphismWithClasses {
    public static void main(String[] args) {
    	/*Employee emp1 = new Employee();
    	emp1.reachOffice();
    	emp1.startProjectWork();*/
    	
    	/*Employee mgr = new Manager();
    	mgr.reachOffice();
    	mgr.startProjectWork();*/
    	
    	Employee p = new Programmer();
    	p.reachOffice();
    	p.startProjectWork();
    	
    	
    	/*Employee emp1 = new Programmer();
        Employee emp2 = new Manager();
        emp1.reachOffice();
        emp2.reachOffice();
        emp1.startProjectWork();
        emp2.startProjectWork();*/
    }
}