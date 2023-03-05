package com.psja.factory;

public class TigerFactory extends FactoryServer{

	@Override
	public Dog getDogFactory( String str ) {
		return null;
	}
	
	@Override
	public Tiger getTigerFactory( String str ) {

		if ( str.equals( "wild" ) )
			return new WildTiger();
		else if ( str.equals( "pet" ) )
			return new PetTiger();
		return null;
	}
}
