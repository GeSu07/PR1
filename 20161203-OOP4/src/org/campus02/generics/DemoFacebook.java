package org.campus02.generics;

import java.util.GregorianCalendar;

public class DemoFacebook {

	public static void main(String[] args) {
		
		MayBe<Integer> alter = new  MayBe<Integer>(40, 1);
		Profil p = new Profil("Susi", "Sorglos", 
				"susi.sorglos@test.com", 
				new MayBe<String>("complicated", 1),
				alter
				, new MayBe<Double>(3000.0, 2) // gehalt
				
				, new MayBe<GregorianCalendar>(
						new GregorianCalendar(1980, 1, 2), 2)
				);
		
		p.print();
		
		Integer number = new Integer(4711);
		System.out.println(number.intValue());
		
		Integer number2 = new Integer("4711");
		System.out.println(number2.intValue());
		
		int value2 = Integer.parseInt("4711");
		System.out.println(value2);
		
	}
}
