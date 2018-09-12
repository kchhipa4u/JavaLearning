package day52.abstractClassConcept;

public class SavingAccount extends Account {

	/*@Override
	public void deposit(int amount) {
		super.deposit(amount);
	}
	
	@Override
	public void withdraw(int amount) {
		super.withdraw(amount);
	}*/
	
	@Override
	public void calcInterest() {
		System.out.println("4% on saving account...");
	}
}
