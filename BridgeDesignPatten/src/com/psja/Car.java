package com.psja;

import static java.lang.System.out;

public class Car extends Vehicle{

	Car( WorkshopPurpose workshopPurpose1, WorkshopPurpose workshopPurpose2 ){
		super( workshopPurpose1, workshopPurpose2 );
	}
	
	@Override
	public void create() {
		out.println( "Car class" );
		workshopPurpose1.work( "RED car" );
		workshopPurpose2.work( "RED car" );
		
	}
}
