package com.singtel.animalsactivity.classes;

class Bird extends Animal implements Flying, Walk {
	void eat() { System.out.println("im eating"); }
}
interface Flying {
	default void fly() {}
}
interface Swimming{
	default void swim() {};
}
interface Singing{
	default void sing() {};
}
interface Sounded{
	default String sound() {
		return null;};
}
interface Walk{
	default void walk() {};
}

class Duck extends Bird implements Swimming,Sounded{}
class Chicken extends Bird implements Sounded{};
class Rooster extends Bird implements Sounded{};
class Parrot extends Bird implements Sounded, Singing{}
class Fish extends Animal implements Swimming{}
class Shark extends Animal implements Swimming{}
class Clownfish extends Animal implements Swimming {}
class Dolhphin extends Animal implements Swimming {}
class Frog extends Bird implements Walk, Sounded,Swimming {}
class Dog extends Animal implements Walk, Sounded, Swimming {}
class Butterfly extends Bird implements Flying {}
class Cat extends Animal implements Walk, Sounded {} 


