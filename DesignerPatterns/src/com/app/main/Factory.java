package com.app.main;

import com.app.modules.Animal;
import com.app.modules.Cat;
import com.app.modules.Dog;
import com.app.modules.Horse;

public class Factory {
	public Animal getAnimalName(String animalType) {
		if(animalType.equals("Cat")) {
			return new Cat();
		}
		else if(animalType.equals("Dog")) {
			return new Dog();
		}
		else if(animalType.equals("Horse")) {
			return new Horse();
		}
		return null;
	}
}
