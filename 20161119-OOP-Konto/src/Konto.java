
public class Konto {
	private String inhaber;
	private int kontostand;
	
	public Konto(String inhaber)
	{
		this.inhaber = inhaber;
		kontostand = 75;
	}
	
	
	public void aufbuchen(int wert)
	{
		if (!validate(wert))
			return ;
		
		this.kontostand += wert;	
	}
	
	private boolean validate(int wert)
	{
		if (inhaber == null || inhaber.isEmpty())
		{
			System.out.println("Inhaber muss gesetzt werden");
			return false;
		}
		if (wert < 0)
		{
			System.out.println("Können keinen negativen Wert aufbuchen");
			return false;
		}
		return true;
	}
	
	public boolean abbuchen(int wert)
	{
		if (!validate(wert))
			return false;
		
		if (kontostand - wert < 0)
		{
			System.out.println("Abheben von " + wert + " funktioniert leider nicht. Da nur " + kontostand + " verfügbar");
			return false;
		}
		
		kontostand -= wert;
		return true;
	}
	
	public void print()
	{
		System.out.println("Inhaber: " 
				+ inhaber + " Kontostand: " + kontostand);
	}
}
