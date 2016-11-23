
public class PolizeiApp {

	public static void main(String[] args) {

		Strafe strafeMax = new Strafe("Max", "Mustermann", "G-AB112", 1);
		strafeMax.strafe(30);
		strafeMax.verbandspaket();
		
		System.out.println("Strafe von Max ist: " + strafeMax.getStrafe());
		
		strafeMax.alkohol(1.12);
		System.out.println("Strafe von Max ist: " + strafeMax.getStrafe());

	}

}
