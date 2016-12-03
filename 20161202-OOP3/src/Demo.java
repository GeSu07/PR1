
public class Demo {
	public static void main(String[] args) {
		
		Bruch b1 = new Bruch(5, 7);
		System.out.println("b1: " + b1.anzahlObjekte);
		System.out.println("Bruch: " + Bruch.anzahlObjekte);
		
		Bruch b2 = new Bruch(3, 4);
		System.out.println("b1: " + b1.anzahlObjekte);
		System.out.println("b2: " + b2.anzahlObjekte);
		System.out.println("Bruch: " + Bruch.anzahlObjekte);
	
		b1.print();
		System.out.println(b1.toDecimal());
		
		Bruch b3 = b1.multiplicate(b2);
		b3.print();
		
		Bruch b4 = b1.multiplicate(b2,b3);
		b4.print();
		
		Bruch b5 = b1.multiplicate(b1);
		Bruch b6 = b1.multiplicate(new Bruch(1, 2));
		
		
		Bruch.printOutNice(b1);
		b1.printOutNice(b1);
		
		
	}
}
