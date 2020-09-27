package bytebank;

import bytebank.models.*;

public class ValuesTest {
	public static void main(String[] args) {
		Account account = new Account(1337, 24226);
		
		System.out.println(account.getAgency());
		
		account.setAgency(1232233);
		
		Account account2 = new Account(1337, 16597);
		account2.deposit(100);
		
		Account account3 = new Account(22113, 12344);
		account3.deposit(200);
		
		System.out.println(Account.getTotal());
	}
}
