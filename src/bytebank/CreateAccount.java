package bytebank;

public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		Account secondAccount = new Account();
		
		
		firstAccount.balance = 300;
		secondAccount.balance = 50;
		
		System.out.println("Primeira conta: " + firstAccount.balance);
		System.out.println("Segunda conta: " + secondAccount.balance);
	}
}
