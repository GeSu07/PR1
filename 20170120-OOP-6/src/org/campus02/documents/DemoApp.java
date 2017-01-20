package org.campus02.documents;

import java.util.ArrayList;

public class DemoApp {

	public static void main(String[] args) {
		
		Document document = new Document("testdocument.txt");
		document.printDocument();
		
		TextDocument textDocument = new TextDocument("textdocument.txt", 
				"das ist ein testdocument");
		textDocument.printDocument();
		
		ImageDocument image = new ImageDocument("image.png", 
				100, 200, "red");
		image.printDocument();
		
		CsvDocument csvDocument = new CsvDocument("demo.csv", 
				new ArrayList<String>());
		csvDocument.addLine("line;column2;usw");
		csvDocument.addLine("line;column2;usw");
		csvDocument.printDocument();
		
		System.out.println();
		ArrayList<String> csv = new ArrayList<>();
		csv.add("line3");
		csv.add("line4");
		Document doc2 = new CsvDocument("demo2", csv);
		doc2.printDocument();
		
		System.out.println("doc2");
		CsvDocument csvdoc2 = (CsvDocument) doc2;
		csvdoc2.printDocument();
		
		System.out.println("doc3");
		//TextDocument tx2 = (TextDocument) doc2;
		//tx2.printDocument();
		
			
		System.out.println("PrintManager");
		PrintManager manager = new PrintManager();
		manager.addDocument(textDocument);
		manager.addDocument(image);
		manager.addDocument(csvDocument);
		manager.addDocument(document);
		
		System.out.println("\nprintAll");
		manager.printAll();
		
		System.out.println("\nfindDocument");
		
		Document f = manager.findDocument("image.png");
		if (f != null)
		{
			System.out.println("image.png gefunden");
			f.printDocument();
		}
		f = manager.findDocument("imageXY.png");
		if (f != null)
		{
			System.out.println("imageXY.png gefunden");
			f.printDocument();
		}
		else
		{
			System.out.println("imageXY nicht gefunden");
		}
		
		
		
		
		
		
		
		
	}

}
