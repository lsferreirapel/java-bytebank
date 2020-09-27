package bytebank;

import bytebank.models.*;

public class NegativeWithdraw {

	public static void main(String[] args) {
		Account account = new Account(23232, 323);
		account.deposit(100);
		account.withdraw(200);
		System.out.println(account.getBalance());
	}
}
