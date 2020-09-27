package bytebank;

import bytebank.models.Account;

public class RefTest {
	public static void main(String[] args) {
		Account firstAccount = new Account(23232, 2323);
		firstAccount.deposit(300);
		
		System.out.println("First account balance: " + firstAccount.getBalance());
		
		
		Account secondAccount = firstAccount;
		secondAccount.deposit(100);
		
		System.out.println("Second balance: " + secondAccount.getBalance());
		System.out.println("First account balance: " + firstAccount.getBalance());
		
		if (firstAccount == secondAccount) {
			System.out.println("São a mesma conta!");
		}
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
