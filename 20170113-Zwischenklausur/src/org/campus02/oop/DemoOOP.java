package org.campus02.oop;

public class DemoOOP {

	public static void main(String[] args) {
		Person p = new Person("Max", "Mustermann", 180, (byte) 3);
		p.printPerson(70);
		Person s = new Person("Susi", "Sorglos", 175, (byte)2);
		s.printPerson(55);
		
		p.printPerson(90);
		p.printPerson(100);
		
	}

}
