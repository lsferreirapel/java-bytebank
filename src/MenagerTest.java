
public class MenagerTest {
	public static void main(String[] args) {
		
		Menager menager = new Menager();
		
		System.out.println(menager.validate(2222));
		
		BonusController controller = new BonusController();
		controller.register(menager);
		
		System.out.println(controller.getSum());
	}
	
}
