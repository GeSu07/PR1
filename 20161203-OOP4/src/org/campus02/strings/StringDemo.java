package org.campus02.strings;

public class StringDemo {

	public static void main(String[] args) {

		
		System.out.println(
				wordsStartingCapitalLetter(
						"Wörter starten mit Großbuchstaben"));

	}
	
	public static String wordsStartingCapitalLetter(String s)
	{
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (i == 0 || s.charAt(i - 1) == ' ')
				c = Character.toUpperCase(c);
			
			result += c;	
		}
		
		return result;
	}

}
