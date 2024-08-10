package org.example.practice.inheritence.animal;

public class App {
	public static void main(String[] args) {

		// using abstract class
		org.example.practice.inheritence.animal.abstractclass.Animal[] an1 = { new org.example.practice.inheritence.animal.abstractclass.Cat(), new org.example.practice.inheritence.animal.abstractclass.Dog() };

		for (org.example.practice.inheritence.animal.abstractclass.Animal a : an1) {
			a.sleep();
			a.eat();
			a.makeSound();
		}

		// counts the number of animals created
		System.out.println(org.example.practice.inheritence.animal.abstractclass.Animal.count);

		// using interface
		org.example.practice.inheritence.animal.intrface.Animal[] an2 = { new org.example.practice.inheritence.animal.intrface.Cat(), new org.example.practice.inheritence.animal.intrface.Dog() };

		for (org.example.practice.inheritence.animal.intrface.Animal a : an2) {
			a.sleep();
			a.eat();
			a.makeSound();
		}
	}
}
