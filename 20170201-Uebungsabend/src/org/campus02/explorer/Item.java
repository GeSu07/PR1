package org.campus02.explorer;

public abstract class Item {

	private String name;

	public Item(String name) {
		super();
		this.name = name;
	}
	
	public abstract int getSize();
	
}
