package models;

public class TaxableTest {
	public static void main(String[] args) {
		CurrentAccount currentAccount = new CurrentAccount(222, 333);
		currentAccount.deposit(100);
		
		LifeInsurance insurance = new LifeInsurance();
		
		TaxCalculator taxCalculator = new TaxCalculator();
		taxCalculator.register(currentAccount);
		taxCalculator.register(insurance);
		
		System.out.println(taxCalculator.getTotalTax());
	}
}
