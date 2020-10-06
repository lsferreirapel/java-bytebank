package models;
public class AccountsTest {
	public static void main(String[] args) {
		CurrentAccount currentAccount = new CurrentAccount(111, 111);
		currentAccount.deposit(100.0);
		
		SavingsAccount savingsAccount = new SavingsAccount(222, 222);
		savingsAccount.deposit(200.0);
		
		currentAccount.transfer(10.0, savingsAccount);
		
		System.out.println("Current: " + currentAccount.getBalance());
		System.out.println("Savings: " + savingsAccount.getBalance());
		
	}
}
