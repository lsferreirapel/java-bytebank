
public class InternalSystem {
	
	private int password = 2222;
	
	public void validate(Authenticable authenticableEmployee) {
		if (authenticableEmployee.validate(this.password)) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
	
}
