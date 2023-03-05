package com.psja.factorymethod;

public class FactoryClient {

	public static void createFactory() {
		
		AnimalFactory dogFactory = new DogFactory();
		Animal animal = dogFactory.factoryAnimal();
		animal.animalBehaviour();
		AnimalFactory tigerFactory = new TigerFactory();
		animal = tigerFactory.factoryAnimal();
		animal.animalBehaviour();
	}
	
}
