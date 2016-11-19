
public class Bank {

	public static void main(String[] args) {

		
		Gehaltskonto konto1 = 
				new Gehaltskonto("Max Mustermann", 
				"AT541223",
				"STASDF12");
		Gehaltskonto konto2 = 
				new Gehaltskonto("Susi Sorglos", 
						"AT344234", "STASDF12");
		Gehaltskonto konto3 =
				new Gehaltskonto("John Smith", 
						"US1324353", "USJKLM44");
		
		konto1.aufbuchen(1000);
		konto2.aufbuchen(2000);
		konto3.aufbuchen(3000);
		
		konto2.setInhaber("Susi's Tochter");
		
		Gehaltskonto[] array = new Gehaltskonto[3];
		array[0] = konto1;
		array[1] = konto2;
		array[2] = konto3;
		
		printKonto(konto1);
		printKonto(konto2);
		printKonto(konto3);
		
		konto1.abbuchen(200);
		printKonto(konto1);
		konto1.abbuchen(1000);
		printKonto(konto1);
		konto2.abbuchen(300);
		printKonto(konto2);
	}
	
	public static void printKonto(Gehaltskonto konto)
	{
		System.out.println(konto.getInhaber() + ": " + konto.getKontostand() + " Euro");
	}

}
