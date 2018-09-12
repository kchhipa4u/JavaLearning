package day52.abstractClassConcept;

public abstract class Account {

	public void deposit(int amount) {
		System.out.println("Deposit amount is: " + amount);
	}
	
	public void withdraw(int amount) {
		System.out.println("amount withdrawn: " + amount);
	}
	
	/*public void calcInterest() {
		System.out.println("interest being calculated");
	}*/
	
	public abstract void calcInterest();
}
