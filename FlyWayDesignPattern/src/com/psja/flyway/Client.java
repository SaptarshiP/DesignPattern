package com.psja.flyway;

import java.lang.Exception;

import com.psja.motor.Vehicle;

public class Client {

	public static void processFlyway() {
		FlywayServer flywayServer = null;
		Vehicle carVehicle = null;
		Vehicle truckVehicle = null;
		try {
			
			flywayServer = new FlywayServer();
			carVehicle = flywayServer.createSpecificObject( "car" );
			carVehicle.setColor( "Green" );
			carVehicle.generateOutput();
			System.out.println( carVehicle );
			carVehicle = flywayServer.createSpecificObject( "car" );
			carVehicle.setColor( "ass" );
			carVehicle.generateOutput();
			System.out.println( carVehicle );
			
			
			truckVehicle = flywayServer.createSpecificObject( "truck" );
			truckVehicle.setColor( "Red" );
			truckVehicle.generateOutput();
			System.out.println( truckVehicle );
			truckVehicle = flywayServer.createSpecificObject( "truck" );
			truckVehicle.setColor( "Blue" );
			truckVehicle.generateOutput();
			System.out.println( truckVehicle );
		} catch( Exception exp ) {
			System.out.println();
		}
	}
	
}
