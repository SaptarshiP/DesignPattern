package com.psja.factory;

public  class DogFactory extends FactoryServer{

	@Override
	public Dog getDogFactory( String str ) {
		
		if ( str.equals( "wild" ) )
			return new WildDog();
		else if ( str.equals( "pet" ) )
			return new PetDog();
		return null;
	}
	
	@Override
	public Tiger getTigerFactory( String str ) {
		return null;
	}
}
