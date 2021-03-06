package org.campus02.generics;

public class MayBeInt {

	private int status;
	// 1: Daten k�nnen eingesehen werden
    // 2: Zugriff verweigert, 3: Daten nicht vorhanden

	
	private int data;
	
	public MayBeInt(int data, int status)
	{
		this.status = status;
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		if (status >= 1 && status <= 3)
			this.status = status;
		else 
			System.out.println("Ung�ltiger Status");
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public void print()
	{
		// 1: Daten k�nnen eingesehen werden
	    // 2: Zugriff verweigert, 3: Daten nicht vorhanden
		
		switch (status) {
		case 1:
			System.out.println("Zugriff gestattet: " + data);			
			break;
		case 2:
			System.out.println("Zugriff verweigert");
			break;
		case 3:
			System.out.println("Nicht erfasst");
			break;
		default:
			System.out.println("Ung�ltiger Status");
			break;
		}
		
		
		
	}
	
}