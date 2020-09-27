package bytebank;

import bytebank.models.Account;

public class MethodTest {
	public static void main(String[] args) {
		Account account = new Account(233, 123);
		account.deposit(100);
		
		account.deposit(50);
		System.out.println(account.getBalance());
		
		boolean successWithdraw = account.withdraw(20);
		if (successWithdraw) {
			System.out.println("Saque feito com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(account.getBalance());
		
		
		Account marcelaAccount = new Account(2323, 12);
		marcelaAccount.deposit(1000);
		if (marcelaAccount.transfer(1000, account)) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		
		System.out.println(account.getBalance());
	}
}
