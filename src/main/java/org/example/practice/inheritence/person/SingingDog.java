package org.example.practice.inheritence.person;

import org.example.practice.inheritence.animal.abstractclass.Dog;

public class SingingDog extends Dog implements Singable {

	@Override
	public void sing() {
		System.out.println("The dog sings. The crowd applaud.");
	}

}
