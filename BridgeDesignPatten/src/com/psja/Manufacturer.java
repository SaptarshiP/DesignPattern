package com.psja;

public class Manufacturer implements WorkshopPurpose{

	@Override
	public void work( String purpose ) {
		System.out.println( "Manufacturing the :"+ purpose );
	}
}
