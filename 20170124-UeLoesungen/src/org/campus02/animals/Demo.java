package org.campus02.animals;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog quaxi = new Frog("quaxi", "red", 2);
		
		quaxi.makeNoise();
		
		Animal quaxiAsAnimal = quaxi;
		quaxiAsAnimal.makeNoise();
		
		Frog f2 = (Frog) quaxiAsAnimal;
		f2.makeNoise();
		
		Nature n = new Nature();
		n.addAnimal(quaxi);
		n.addAnimal(new Dog("bello", "blue", 2));
		n.addAnimal(new Bird("flippi", "red" ,2));
		n.addAnimal(new Frog("hansifrosch", "red", 3));
		n.addAnimal(new Dog("mausi", "yellow", 2));
		
		System.out.println(n.countColor("red"));
		System.out.println(n.countColor("blue"));
		System.out.println(n.countColor("yellow"));
		
		
		System.out.println(n.getCountByColor());

	
		quaxiAsAnimal.makeNoise();
	}

}
