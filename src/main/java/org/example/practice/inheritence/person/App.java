package org.example.practice.inheritence.person;

public class App {

	static Singable[] singers = { new SingingDog(), new SingingPerson() };

	public static void main(String[] args) {

		// we are hosting a singing competition
		// we need to have an array of singers
		// and iterate through it

		for (Singable s : singers) {
			s.sing();
		}

		System.out.println();

		// an implementation of
		// strategy pattern

		Singable singer = new SingingDancingMonkey();
		singer.sing();
		
		// we cannot use the singer.dance() function here,
		// since the singable object doesn't have it
		
		Danceable dancer = (Danceable) singer;
		dancer.dance();

	}

}
