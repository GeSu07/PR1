
public class Bruch {
	private int zaehler;
	private int nenner;
	
	public static int anzahlObjekte;
	
	public Bruch(int zaehler, int nenner) {
		super();
		this.zaehler = zaehler;
		this.nenner = nenner;
		
		anzahlObjekte++;
	}
	
	public Bruch(BruchEinfach be)
	{
		this.zaehler = be.getZ();
		this.nenner = be.getN();
	}
	
	public int getZaehler() {
		return zaehler;
	}
	public int getNenner() {
		return nenner;
	}
	
	public void print()
	{
		System.out.println(zaehler + " / " + nenner);
	}
	
	public double toDecimal()
	{
		return zaehler * 1.0 / nenner;
	}
	
	public Bruch multiplicate(Bruch b2)
	{
		//int zaehler = this.zaehler * b2.getZaehler();
		//int nenner = this.nenner * b2.getNenner();
		
		return new Bruch(this.zaehler * b2.getZaehler(), 
				this.nenner * b2.getNenner());
	}
	
	public Bruch multiplicate(Bruch b2, Bruch b3)
	{
	
		return new Bruch(this.zaehler * b2.getZaehler()* b3.getZaehler(), 
				this.nenner * b2.getNenner()* b3.getNenner());
	}
	
	public static void printOutNice(Bruch b1)
	{
		b1.print();
	}
}
