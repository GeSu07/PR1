package org.campus02.animals;

public abstract class Animal
{
	private String name;
	private String color;
	private int countEyes;
	
	public Animal(String name, String color, int countEyes)
	{
		this.name = name;
		this.color = color;
		this.countEyes = countEyes;
	}
	
	
	
	public String getColor() {
		return color;
	}



	public abstract void walk();
	
	
	
	public abstract void makeNoise();
	
	@Override
	public String toString() {
		return "name = " + name;
	}
}


