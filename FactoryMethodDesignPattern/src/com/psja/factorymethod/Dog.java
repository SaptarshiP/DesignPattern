package com.psja.factorymethod;

import static java.lang.System.out;

public class Dog implements Animal{

	@Override
	public void animalBehaviour() {
		out.println( "I like to bark" );
		out.println( "I like to roam in house" );
	}
}
