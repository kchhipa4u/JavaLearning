package day27.datahidingAndAbstraction;

public class Customer {
	static Account ac1 = new Account();

	public static void main(String[] args) {
		AccountDetail ad = new AccountDetail();
		ad.setAccountId("123");
		ad.setPwd("password");
		
		int balanceAmount = ac1.getBalance(ad);

		System.out.println("My available balance is: " + balanceAmount);
		
	}
}
