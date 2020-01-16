package com.singtel.animalsactivity.classes;

public class AnimalActions {
	static boolean fly(Animal animal) {
        // Check if this Bird implements the Flyable interface
		if(animal instanceof Flying) { return true; } else { return false;}
    }
	static boolean swim(Animal animal) {
        // Check if this Bird implements the Swim interface
        if(animal instanceof Swimming) { return true;} else { return false;}
    }
	static boolean walk(Animal animal) {
        // Check if this Bird implements the Flyable interface
		if(animal instanceof Swimming) { return true;} else { return false;}
    }
	static boolean sing(Animal animal) {
        // Check if this Bird implements the Flyable interface
		if(animal instanceof Singing) { return true;} else { return false;}
    }
	public static void main(String args[]) {
		Animal[] animals = new Animal[] {
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dog(),
				new Dolhphin(),
				new Frog(),
				new Butterfly(),
				new Cat()				
		};
		
		for(Animal animal : animals) {
			System.out.println(animal.getClass()+": can " + ((fly(animal)) ? " fly " : " ") + ((swim(animal)) ? " swim " : "") + ((walk(animal)) ? " walk " : "") + ((walk(animal)) ? " sing " : ""));
		}
		
	}
}
