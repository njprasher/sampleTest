package org.example.practice.inheritence.animal.abstractclass;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("The dog barks.");
	}

	// extra stuff a dog can do
	public void fetchStick() {
		System.out.println("The dog fetches the stick.");
	}

}
