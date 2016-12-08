package org.campus02.generics;

public class MayBe<KK> {
	private int status;
	// 1: Daten können eingesehen werden
    // 2: Zugriff verweigert, 3: Daten nicht vorhanden

	
	private KK data;
	
	public MayBe(KK data, int status)
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
			System.out.println("Ungültiger Status");
	}
	
	public void setData(KK data) {
		this.data = data;
	}
	
	public void print()
	{
		// 1: Daten können eingesehen werden
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
			System.out.println("Ungültiger Status");
			break;
		}
		
		
		
	}

}
