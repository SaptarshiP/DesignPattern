package com.psja.factory;

public class PetDog implements Dog {

	@Override
	public void behaviour() {
		System.out.println( "I am a Pet dog" );
	}
}
