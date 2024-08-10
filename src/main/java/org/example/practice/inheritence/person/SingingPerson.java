package org.example.practice.inheritence.person;

public class SingingPerson extends Person implements Singable {

	@Override
	public void sing() {
		System.out.println("The person sings. People leave.");
	}

}
