package org.campus02.zinsen.biz;

public class Konto {
	private double kapital;

	public Konto(double kapital) {
		super();
		this.kapital = kapital;
	}
	
	public double zinsen(int tage, double zinssatz)
	{
		double zinsen = kapital * tage / 36000 * zinssatz;
		return zinsen;
	}
}
