package org.campus02.documents;

import java.util.ArrayList;

public class PrintManager {
	private ArrayList<Document> documents= new ArrayList<Document>();
	
	public PrintManager()
	{
		//documents= new ArrayList<Document>();
	}
	
	public void addDocument(Document d)
	{
		documents.add(d);
	}
	
	public void printAll()
	{
		/*for (Document document : documents) {
			document.printDocument();
		}*/
		for (int i = 0; i < documents.size(); i++)
		{
			documents.get(i).printDocument();
		}
	}
	
	public Document findDocument(String fileName)
	{
		for (Document document : documents) 
		{
			if (document.fileName.equals(fileName))
			{
				return document;
			}
		}
		return null;
	}
	
}
