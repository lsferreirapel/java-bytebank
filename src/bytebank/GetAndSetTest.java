package bytebank;

import bytebank.models.*;

public class GetAndSetTest {
	public static void main(String[] args) {
		Account account = new Account(123, 124);
		// account.number = 1337;
		account.setNumber(1337);
		System.out.println(account.getNumber());
	}
}
