
public class AuthenticatorHelper {
	private int password;
	
	public void setPassword(int password) {
		this.password = password;
	}

	public boolean validate(int password) {
		if (this.password == password) {
			return true;
		}
		return false;
	}
}

