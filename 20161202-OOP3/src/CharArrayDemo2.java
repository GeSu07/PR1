import bruch.Bruch;

public class CharArrayDemo2 {

	public static void main(String[] args) {
		
		char[] test = new char[] {'a', 'b', 'c', 'd'};
		char[] test2 = new char[4];
		test2[0] = 'e';
		test2[1] = 'f';
		test2[2] = 'g';
		test2[3] = 'h';
		
		String testString = "Hallo PR1 in Graz, am Freitag!";
		char[] testFromString = testString.toCharArray();
		CharArray a0 = new CharArray(test);
		CharArray a1 = new CharArray(testFromString);
		a1.print();
		a1.print(4, 10);
		System.out.println(a1.length());
		System.out.println("Anzahl CharArray: " + CharArray.countObjects);
		
		Bruch b1 = new Bruch(3, 4);
		
	}

	
}
