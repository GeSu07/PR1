package org.campus02.generics;

public class DemoFacebook {

	public static void main(String[] args) {
		Profil p = new Profil("Susi", "Sorglos", "susi.sorglos@test.com", "complicated", new MayBeInt(40, 2));
		
		p.print();
		
	}
}
