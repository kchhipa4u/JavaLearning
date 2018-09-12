package day32.overriding;
class Employee {
    public void reachOffice() {
        System.out.println("reached office - Gurgaon, India");
    }

    public void startProjectWork() {
        System.out.println("procure hardware");
        System.out.println("install software");
    }
}

class Manager extends Employee {
    
	public void startProjectWork() {
        meetingWithCustomer();
        defineProjectSchedule();
        assignRespToTeam();
    }

    private void meetingWithCustomer() {
        System.out.println("meet Customer");
    }

    private void defineProjectSchedule() {
        System.out.println("Project Schedule");
    }

    private void assignRespToTeam() {
        System.out.println("team work starts");
    }
}

class Programmer extends Employee {
    public void startProjectWork() {
        defineClasses();
        unitTestCode();
    }

    public void defineClasses() {
        System.out.println("define classes");
    }

    private void unitTestCode() {
        System.out.println("unit test code");
    }
}