package models;

public abstract class Account {
	protected double balance;
	private int agency;
	private int number;
	private Client owner;
	private static int total = 0;
	
	public Account(int agency, int number) {
		Account.total++;
//		System.out.println("O total de contas é " + Account.total);
		this.agency = agency;
		this.number = number;
		this.balance = 100;
//		System.out.println("Estou criando uma conta " + this.number);
	}
	
	public abstract void deposit(double value);
	
	public boolean withdraw(double value) {
		if(value <= this.balance) {
			this.balance -= value;
			return true;			
		}
		return false;
	}
	
	public boolean transfer(double value, Account destiny) {
		if(this.withdraw(value)) {
			destiny.deposit(value);
			return true;
		}
		return false;
	}
	
	public int getAgency() {
		return agency;
	}
	public void setAgency(int agency) {
		this.agency = agency;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Client getOwner() {
		return owner;
	}

	public static int getTotal() {
		return Account.total;
	}
}
