package org.campus02.string;

public class CSVDemo {

	public static void main(String[] args) {

		CSVParser parser = new CSVParser("spalt  e1,spa lteB,spalte3,spalte4,");
		
		System.out.println(parser.countComma());
		
		String[] columns = parser.parse();
		for (int i = 0; i < columns.length; i++) {
			System.out.println(columns[i]);
		}
		
		System.out.println(parser.deleteBlanks());
		System.out.println(parser.countNumbers());
		
		CSVParser pwd = new CSVParser("Programmieren EINS ist super!");
		System.out.println(pwd.generatePassword());

	}

}
