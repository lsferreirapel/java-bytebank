package bytebank.models;

public class Account {
	private double balance;
	private int agency;
	private int number;
	private Owner owner;
	private static int total;
	
	public Account(int agency, int number) {
		Account.total++;
		System.out.println("O total de conta é: " + Account.total);
		this.agency = agency;
		this.number = number;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public boolean withdraw(double value) {
		if (this.balance >= value) {
			this.balance -= value;
			return true;
		} 
		return false;
	}
	
	public boolean transfer(double value, Account destination) {
		if (this.balance >= value) {
			this.balance -= value;
			destination.deposit(value);
			return true;
		}
		
		return false;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getAgency() {
		return this.agency;
	}
	public void setAgency(int agency) {
		this.agency = agency;
	}
	
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public static int getTotal() {
		return Account.total;
	}
	
}

