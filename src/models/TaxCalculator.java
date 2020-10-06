package models;

public class TaxCalculator {
	
	private double totalTax;
	
	public void register(Taxable taxable) {
		this.totalTax += taxable.getTaxValue();
	}
	
	public double getTotalTax() {
		return totalTax;
	}
}
