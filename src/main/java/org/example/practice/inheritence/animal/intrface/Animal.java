package org.example.practice.inheritence.animal.intrface;

public interface Animal {
	void sleep();

	void eat();

	void makeSound();

	// we cannot have fetchStick() or chaseMice() here
	// since that would force all animals to fetch
	// sticks and chase mice
}
