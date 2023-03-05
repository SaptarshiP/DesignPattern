package com.psja;

import static java.lang.System.out;

public class Bus extends Vehicle{

	Bus( WorkshopPurpose workshopPurpose1, WorkshopPurpose workshopPurpose2 ){
		super( workshopPurpose1, workshopPurpose2 );
	}

	@Override
	public void create() {
		out.println( "In the bus class" );
		workshopPurpose1.work( "Orange bus" );
		workshopPurpose2.work( "Orange bus" );;
	}
}
