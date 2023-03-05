package com.psja.factory;

public class FactoryClient {

	public static void createFactoryClient() {
		
		FactoryServer factoryServer = new DogFactory();
		Dog dog = factoryServer.getDogFactory( "wild" );
		dog.behaviour();
		
		factoryServer = new TigerFactory();
		Tiger tiger = factoryServer.getTigerFactory( "pet" );
		tiger.behaviour();
	}
	
}
