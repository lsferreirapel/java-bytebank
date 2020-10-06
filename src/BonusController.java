
public class BonusController {
	private double sum;
	
	public void register(Menager menager) {
		double bonus = menager.getBonus();
		this.sum += bonus;
	}
	
	public double getSum() {
		return sum;
	}
}
