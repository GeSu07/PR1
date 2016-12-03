package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.Konto;

public class DemoZinsen {

	public static void main(String[] args) {

		Konto k = new Konto(10000);
		
		System.out.println(k.zinsen(100, 1));

	}

}
