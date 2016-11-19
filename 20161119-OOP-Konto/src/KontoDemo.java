
public class KontoDemo {
	public static void main(String[] args) {
		
		Konto[] konten = new Konto[1000];
		
		Konto max = new Konto("Max Mustermann");
		//max.setInhaber("Max Mustermann");
		konten[0] = max;
		
		Konto susi = new Konto("Susi Sorglos");
		//susi.setInhaber("Susi Sorglos");
		susi.aufbuchen(10_000);
		konten[1] = susi;
		
		max.aufbuchen(200);
		
		Konto leer = new Konto("");
	
		Konto xzy = new Konto("Max Muster");

		String name = "Susi Maier";
		
		
		
		
		
		if (max.abbuchen(100))
		{
			System.out.println(" erfolgreich");
		}
		max.print();
		
		if (max.abbuchen(100))
		{
			System.out.println( " erfolgreich");
		}
		
		if (max.abbuchen(100))
		{
			System.out.println("erfolgreich");
		}
		
		if (susi.abbuchen(3000))
		{
			System.out.println("Susi: erfolgreich");
		}
		
		
		for(int i = 0; i < konten.length; i++)
		{
			if (konten[i] != null)
				konten[i].abbuchen(10);
			else
				break;
			
		}
		
	}
}
