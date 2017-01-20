package org.campus02.documents;

import java.util.ArrayList;

public class CsvDocument extends Document {

	private ArrayList<String> lines;
	
	public CsvDocument(String fileName, 
			ArrayList<String> lines)
	{
		super(fileName);
		this.lines = lines;
	}
	
	public void addLine(String line)
	{
		lines.add(line);
	}
	
	@Override
	public void printDocument()
	{
		System.out.println("CsvDocument: " + fileName);
		for (String string : lines) {
			System.out.println(string);
		}
	}
}
