package org.example.practice.inheritence.animal.abstractclass;

public class Cat extends Animal {

	@Override
	public void makeSound() {
		System.out.println("The cat meows.");
	}

	
	// extra stuff a cat can do
	public void chaseMice() {
		System.out.println("The cat chases mice.");
	}

}
