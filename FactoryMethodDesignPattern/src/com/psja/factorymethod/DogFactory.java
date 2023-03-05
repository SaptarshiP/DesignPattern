package com.psja.factorymethod;

public class DogFactory extends AnimalFactory{

	@Override
	Animal factoryAnimal() {
		return new Dog();
	}
}
