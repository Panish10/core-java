package com.designpattern.creational.factory;

public class AnimalDemo {
	public static void main(String[] args) {
		String animalType = args[0];
		AnimalFactory factory = new AnimalFactory();
		Animal animal = factory.createAnimal(animalType);
		animal.eat();
	}
}
