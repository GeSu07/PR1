
public class DemoApp {

	public static void main(String[] args) {
	/*	Car porsche = new Car();
		porsche.colour = "black";
		porsche.engine = new Engine();
		porsche.engine.number = "AT16233";
*/
		
		Person max = new Person();
		max.firstName = "Max";
		max.lastName = "Mustermann";
		max.age = 36;
		max.setAddress("Graz", "8010", "Mustergasse 1");
	
		System.out.println(max.firstName + " " + max.lastName + " Age: " + max.age);
	}

}
