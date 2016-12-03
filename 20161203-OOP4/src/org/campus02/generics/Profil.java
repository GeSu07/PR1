package org.campus02.generics;

public class Profil {

	private String vorname;
	private String nachname;
	private String email;
	private String bezStatus;
	private MayBeInt alter;
	
	public Profil(String vorname, String nachname, String email, String bezStatus, MayBeInt alter) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.bezStatus = bezStatus;
		this.alter = alter;
	}
	
	public void print()
	{
		System.out.println(vorname + " " + nachname);
		alter.print();
	}
}
