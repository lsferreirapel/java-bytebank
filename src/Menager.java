
public class Menager extends Employee implements Authenticable{

	private AuthenticatorHelper authenticatorHelper = new AuthenticatorHelper();
	
	@Override
	public double getBonus() {
		return  super.getSalary();
	}

	@Override
	public void setPassword(int password) {
		authenticatorHelper.setPassword(password);
	}

	@Override
	public boolean validate(int password) {
		return authenticatorHelper.validate(password);
	}
}
