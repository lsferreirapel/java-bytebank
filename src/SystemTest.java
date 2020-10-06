
public class SystemTest {
	public static void main(String[] args) {
		Menager menager = new Menager();
		menager.setPassword(2222);
		
		Administrator adm = new Administrator();
		adm.setPassword(3333);
		
		InternalSystem internalSystem = new InternalSystem();
		internalSystem.validate(menager);
		internalSystem.validate(adm);
	}
}
