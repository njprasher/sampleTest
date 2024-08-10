package org.example.practice.inheritence.person;

public class SingingDancingMonkey implements Singable, Danceable {

	@Override
	public void sing() {
		System.out.println("The monkey sings.");
	}

	@Override
	public void dance() {
		System.out.println("The monkey dances.");
	}

}
