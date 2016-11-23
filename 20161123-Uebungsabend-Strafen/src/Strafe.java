
public class Strafe {
	private String vorname;
	private String nachname;
	private String kennzeichen;
	private int strafnummer;
	private double strafe;
	private byte anzahl;
	
	public Strafe(String vorname, String nachname, String kennzeichen, int strafnummer) {
	
		this.vorname = vorname;
		this.nachname = nachname;
		this.kennzeichen = kennzeichen;
		this.strafnummer = strafnummer;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public int getStrafnummer() {
		return strafnummer;
	}

	public double getStrafe() {
		if (anzahl == 1)
			return strafe * 0.7;
		else if (anzahl == 2)
			return strafe * 0.8;
		else if (anzahl == 3)
			return strafe * 0.9;
		else 
			return strafe;
		
	}

	public byte getAnzahl() {
		return anzahl;
	}
	
	public void strafe(int geschwindigskeitsueberschreitung)
	{
		if (geschwindigskeitsueberschreitung < 20)
			strafe += 20;
		else if (geschwindigskeitsueberschreitung < 30)
			strafe += 50;
		else if (geschwindigskeitsueberschreitung < 50)
			strafe += 100;
		else if (geschwindigskeitsueberschreitung < 100)
			strafe += 500;
		else 
			strafe += 1500;
		
		anzahl++;
		
	}
	
	public void verbandspaket()
	{
		anzahl++;
		strafe+=25;
	}
	
	public void alkohol(double wert)
	{
		if (wert < 0.5)
			return ;
		
		anzahl+=2;
		
		if (wert >= 0.5 && wert < 1)
			strafe += 100;
		else if (wert >= 1 && wert < 2)
			strafe += 400;
		else if (wert >= 2 && wert < 3)
			strafe += 1000;
		else if (wert > 3)
			strafe += 5000;
	}
	
	public void sonstiges(double wert)
	{
		strafe += wert;
		anzahl ++;
	}
	
	
}
