package org.campus02.accounts;

public class JugendGiroKonto extends GiroKonto {

	protected double buchungslimit;

	public JugendGiroKonto(String inhaber, double limit, 
			double buchungslimit) {
		super(inhaber, limit);
		this.buchungslimit = buchungslimit;
	}
	
	public void auszahlen (double wert)
	{
		if (wert > buchungslimit)
		{
			System.out.println("Wert pro Buchung �berschritten");
		}
		else
			super.auszahlen(wert);
	}
}
