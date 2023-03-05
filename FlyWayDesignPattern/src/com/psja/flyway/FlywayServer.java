package com.psja.flyway;

import java.util.Map;
import java.util.HashMap;

import com.psja.motor.Car;
import com.psja.motor.Truck;
import com.psja.motor.Vehicle;

public final class FlywayServer {

	private Map< String, Vehicle > objectMap = new HashMap<>();
	
	public Vehicle createSpecificObject( String type )throws RuntimeException {
		Vehicle vehicle = null;
		if ( !objectMap.containsKey( type ) ) {
			if ( type.equalsIgnoreCase( "car" ) ) 
				vehicle = new Car();
			else if ( type.equalsIgnoreCase( "truck" ) )
				vehicle = new Truck();
			else
				throw new RuntimeException( "The input not found" );
			objectMap.put( type, vehicle );
		}
		else
			vehicle = objectMap.get( type );
		return vehicle;
	}
	
}
