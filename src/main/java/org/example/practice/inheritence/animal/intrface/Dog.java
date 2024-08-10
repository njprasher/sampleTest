package org.example.practice.inheritence.animal.intrface;

public class Dog implements Animal {

	// the properties have to be specified in each implementation
	int age;
	String name;

	@Override
	public void sleep() {
		System.out.println("The dog sleeps.");
	}

	@Override
	public void eat() {
		System.out.println("The dog eats.");
	}

	@Override
	public void makeSound() {
		System.out.println("The dog barks.");
	}

	// extra stuff a dog can do
	public void fetchStick() {
		System.out.println("The dog fetches the stick.");
	}
}
