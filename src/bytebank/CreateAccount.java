package bytebank;
import bytebank.models.Account;

public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account(52345, 15);
		Account secondAccount = new Account(1234, 32);
		
		firstAccount.deposit(300);
		secondAccount.deposit(300);
		
		System.out.println("Primeira conta: " + firstAccount.getBalance());
		System.out.println("Segunda conta: " + secondAccount.getBalance());
		
		if (firstAccount == secondAccount) {
			System.out.println("São a mesma conta!");
		} else {
			System.out.println("Não são a mesma conta!");
		}
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
