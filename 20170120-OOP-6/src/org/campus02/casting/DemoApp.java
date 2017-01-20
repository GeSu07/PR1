package org.campus02.casting;

public class DemoApp {
	public static void main(String[] args) {
		
		
		Object[] store = new Object[3];
		
		store[0] = new Lektor();
		store[1] = new Mentor();
		store[2] = new Student();
		
		/*
		Person o = new Mentor();
		Mentor m = (Mentor) o;
		Lektor l = (Lektor) o;
		Lektor l1 = (Mentor) o;*/
		
		for (Object object : store) {
			System.out.println(object);
		}
			
			
		}
}
