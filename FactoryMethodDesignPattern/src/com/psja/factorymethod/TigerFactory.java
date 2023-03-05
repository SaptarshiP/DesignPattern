package com.psja.factorymethod;

public class TigerFactory extends AnimalFactory {

	@Override
	Animal factoryAnimal() {
		return new Tiger();
	} 
}
