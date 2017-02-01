package org.campus02.animals;

public class Frog extends Animal {

	
	
	public Frog(String name, String color, int countEyes) {
		super(name, color, countEyes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("der frosch springt");

	}

	@Override
	public void makeNoise() {
		System.out.println("quak quak");

	}

}
