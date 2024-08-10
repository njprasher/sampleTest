package org.example.practice.inheritence.animal.abstractclass;

public abstract class Animal {

	protected int age;
	protected String name;
	
	// static variable is used when the variable makes
	// sense only as part of the entire collection
	// and not as part of an animal.
	// here it makes sense to have a count of animal
	// objects that are created so that we can know
	// how many animals have been created
	public static int count;

	Animal() {
		count++;
	}

	// common methods that can be used by children
	// without writing extra code
	public void sleep() {
		System.out.println("The animal sleeps.");
	}

	public void eat() {
		System.out.println("The animal eats.");
	}

	// specialized methods that we don't know how to
	// implement, or doesn't make sense to define here
	// since it is not common for all animals
	public abstract void makeSound();
}
