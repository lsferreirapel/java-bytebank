package models;

public class CurrentAccount extends Account  implements Taxable{
	
	public CurrentAccount(int agency, int number) {
		super(agency, number);
	}
	
	@Override
	public boolean withdraw(double value) {
		value =+ 0.2;
		return super.withdraw(value);
	}
	
	@Override
	public void deposit(double value) {
		super.balance += value;
	}
	
	@Override
	public double getTaxValue() {
		return super.balance * 0.1;
	}
}
