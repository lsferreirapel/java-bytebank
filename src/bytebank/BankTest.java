package bytebank;

import bytebank.models.*;

public class BankTest {
	public static void main(String[] args) {
		Owner lucas = new Owner();
		lucas.setName("Lucas Ferreira");
		lucas.setCpf("222.222.222-22");
		lucas.setProfession("Programmer");
		
		Account lucasAccount = new Account(234, 42);
		lucasAccount.deposit(100);
		lucasAccount.setOwner(lucas);
		
		System.out.println(lucasAccount.getOwner().getName());
		
		// example 2
		Account marcelaAccount = new Account(84, 93);
		marcelaAccount.setOwner(new Owner());
		marcelaAccount.getOwner().setName("Marcela");
		System.out.println(marcelaAccount.getOwner().getName());
	}
}
