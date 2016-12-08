package org.campus02.generics;

import java.util.GregorianCalendar;

public class Profil {

	private String vorname;
	private String nachname;
	private String email;
	private MayBe<String> bezStatus;
	private MayBe<Integer> alter;
	private MayBe<Double> gehalt;
	private MayBe<GregorianCalendar> gebDatum;
	
	public Profil(String vorname, String nachname, 
			String email, MayBe<String> bezStatus, 
			MayBe<Integer> alter, MayBe<Double> gehalt,
			MayBe<GregorianCalendar> gebDatum) {
		
		this.setVorname(vorname);
		setVorname(vorname);
		this.nachname = nachname;
		this.email = email;
		this.bezStatus = bezStatus;
		this.alter = alter;
		this.gehalt = gehalt;
		this.gebDatum = gebDatum;
		
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBezStatus(MayBe<String> bezStatus) {
		this.bezStatus = bezStatus;
	}

	public void setAlter(MayBe<Integer> alter) {
		this.alter = alter;
	}

	public void setGehalt(MayBe<Double> gehalt) {
		this.gehalt = gehalt;
	}

	public void setGebDatum(MayBe<GregorianCalendar> gebDatum) {
		this.gebDatum = gebDatum;
	}
	
	public void printAlter()
	{
		alter.print();
	}

	public void print()
	{
		System.out.println(vorname + " " + nachname);
		System.out.print("Beziehungsstatus: ");
		bezStatus.print();
		System.out.print("Alter: ");
		alter.print();
		System.out.print("Gehalt: ");
		gehalt.print();
	}
}
