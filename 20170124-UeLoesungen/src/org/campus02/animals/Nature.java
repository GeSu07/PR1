package org.campus02.animals;

import java.util.ArrayList;
import java.util.HashMap;

public class Nature {

	private ArrayList<Animal> animals = new ArrayList<>();
	
	public void addAnimal(Animal a)
	{
		animals.add(a);
	}
	
	public int countColor(String color)
	{
		int count = 0;
		// code
		for (Animal animal : animals) {
			if (animal.getColor().equals(color))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public HashMap<String, Integer> getCountByColor()
	{
		HashMap<String, Integer> colors = new HashMap<>();
	
		//colors.put(key, value);
		//colors.containsKey(key);
		//colors.get(key);
		
		 // code#
		for (Animal animal : animals) {
			if (colors.containsKey(animal.getColor()))
			{
				// auslesen, erhöhen, put
				int currentCount = colors.get(animal.getColor());
				currentCount++;
				colors.put(animal.getColor(), currentCount);
			}
			else
			{
				colors.put(animal.getColor(), 1);
			}
		}
		
		return colors;
	}
	
}
