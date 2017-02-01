package org.campus02.explorer;

import java.util.ArrayList;

public class Folder extends Item {

	private ArrayList<Item> items = new ArrayList<>();
	
	public void add(Item i)
	{
		items.add(i);
	}
	
	public Folder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
