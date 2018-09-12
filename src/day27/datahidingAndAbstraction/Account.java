package day27.datahidingAndAbstraction;

public class Account {

	// Data Hiding
	private int balance;

	// This will exposed to outer world or all consumer of this API
	// Abstraction
	public int getBalance(AccountDetail ad) {

		boolean isValid = verifyAccount(ad);
		
		if(isValid) {
			 balance = getActualAmount();
		}
		else {
			System.out.println("Sorry, you have entered incorrect information");
		}
		return balance;
	}

	// this is for private use only
	private int getActualAmount() {
		return 1000;
	}

	// this is for private use only
	private boolean verifyAccount(AccountDetail ad) {
		if (ad.getAccountId().equals("1234") && ad.getPwd().equals("password")) {
			return true;
		}
		return false;
	}
}
