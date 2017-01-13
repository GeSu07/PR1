package org.campus02.oop;

public class Person {
	private int id;
	private String vorname;
	private String nachname;
	private int koerpergroesse;
	private byte aktivitaetslevel;
	
	private static int s_id = 0;

	public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.koerpergroesse = koerpergroesse;
		this.aktivitaetslevel = aktivitaetslevel;
		this.id = ++s_id;
	}

	public int getKoerpergroesse() {
		return koerpergroesse;
	}

	public void setKoerpergroesse(int koerpergroesse) {
		this.koerpergroesse = koerpergroesse;
	}

	public byte getAktivitaetslevel() {
		return aktivitaetslevel;
	}

	public void setAktivitaetslevel(byte aktivitaetslevel) {
		this.aktivitaetslevel = aktivitaetslevel;
	}

	public int getId() {
		return id;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}
	
	public String rechneBMI(int gewicht)
	{
		double bmi = gewicht / ((koerpergroesse / 100.0) * (koerpergroesse / 100.0));
		
		if (bmi < 18.5)
			return "Untergewicht";
		if (bmi < 25)
			return "Normalgewicht";
		if (bmi < 30)
			return "Übergewicht";
		return "Adipositas";
	}
	
	public void printPerson(int gewicht)
	{
		switch (aktivitaetslevel) {
		case 1:
			System.out.println(vorname + " " + nachname + ", Couch Potato, " + rechneBMI(gewicht));
			break;
		case 2:
			System.out.println(vorname + " " + nachname + ", Gelegenheitssportler, " + rechneBMI(gewicht));
			break;
		case 3:
			System.out.println(vorname + " " + nachname + ", Sportler, " + rechneBMI(gewicht));
			break;
		case 4:
			System.out.println(vorname + " " + nachname + ", Profisportler, " + rechneBMI(gewicht));
			break;

		default:
			break;
		}
	}
}
