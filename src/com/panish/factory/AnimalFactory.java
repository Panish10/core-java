package com.designpattern.creational.factory;

public class AnimalFactory {
	public Animal createAnimal(String animalType) {
		if(animalType == null) return null;
		
		if("cat".equalsIgnoreCase(animalType))
			return new Cat();
		else if("dog".equalsIgnoreCase(animalType))
			return new Dog();
		else if("fox".equalsIgnoreCase(animalType))
			return new Fox();
		
		else return null;
	}
}
