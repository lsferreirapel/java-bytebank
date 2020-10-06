
public class Administrator extends Employee implements Authenticable{
	
	private AuthenticatorHelper authenticatorHelper = new AuthenticatorHelper();

	
	@Override
	public double getBonus() {
		return 50;
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
