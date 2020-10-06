
public abstract interface Authenticable {

	public abstract void setPassword(int password);
	
	public abstract boolean validate(int password);	
}
