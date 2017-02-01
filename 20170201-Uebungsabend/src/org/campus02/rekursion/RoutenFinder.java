package org.campus02.rekursion;

public class RoutenFinder {

	public static void main(String[] args) {
		
		Ort graz = new Ort("graz");
		Ort wien = new Ort("wien");
		Ort marburg = new Ort("marburg");
		Ort linz = new Ort ("linz");
		
		//graz.addNachbar(marburg);
		graz.addNachbar(wien);
		
		wien.addNachbar(linz);
		
		linz.addNachbar(graz);
		marburg.addNachbar(graz);
		wien.addNachbar(graz);
		linz.addNachbar(wien);
		

		System.out.println(graz.hasCircle());
		System.out.println(marburg.hasCircle());
		
		//System.out.println(countHops(marburg, linz, null));
	}
	

	
	
	
	
	
	
	
	
	private static int countHops(Ort current, 
			Ort destination, Ort last)
{
	for(Ort ort : current.getNachbarn())
	{
		System.out.println(ort.getName() + " - " + current.getName());
		
		if (ort==last)
			continue;
		
		if (ort == destination)
		{
			return 1;
		}
		
		int hops = countHops(ort, destination, current);
		if (hops > 0)
			return hops + 1;
	}
	return 0;
	
}
	
	
}
