
public class Client implements Authenticable{

	private AuthenticatorHelper authenticatorHelper = new AuthenticatorHelper();
	
	@Override
	public void setPassword(int password) {
		authenticatorHelper.setPassword(password);
	}

	@Override
	public boolean validate(int password) {
		return authenticatorHelper.validate(password);
	}
}
