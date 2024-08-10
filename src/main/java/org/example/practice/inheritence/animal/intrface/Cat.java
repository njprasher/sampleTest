package org.example.practice.inheritence.animal.intrface;

public class Cat implements Animal {

	// the properties have to be specified in each implementation
	int age;
	String name;

	@Override
	public void sleep() {
		System.out.println("The cat sleeps.");
	}

	@Override
	public void eat() {
		System.out.println("The cat eats.");
	}

	@Override
	public void makeSound() {
		System.out.println("The cat meows.");
	}

	// extra stuff a cat can do
	public void chaseMice() {
		System.out.println("The cat chases mice.");
	}

}
